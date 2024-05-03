package com.curso04.login.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso04.login.mvc.modelo.Cliente;
import com.curso04.login.mvc.modelo.servicios.ClienteService;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/inicio")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteService clienteService = new ClienteService();
		List<Cliente> lstClientes = clienteService.obtenerListaClientes();
		
		request.setAttribute("clientes", lstClientes);
		
		request.getRequestDispatcher("inicio_tag.jsp").forward(request, response);
	}

}
