package com.curso04.login.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso04.login.mvc.modelo.Usuario;
import com.curso04.login.mvc.modelo.servicios.UsuarioService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CAPTURAMOS PARAMETROS DESDE EL FORMULARIO
		String usuario = request.getParameter("usuario_form");
		String password = request.getParameter("password_form");
		
		Usuario usuario1 = new Usuario(usuario, password);
		
		UsuarioService servicio = new UsuarioService();
		boolean esValido = servicio.validarUsuario(usuario1);
		
		if(esValido) {
			response.sendRedirect("inicio.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}
