package com.curso04.prueba;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumarServlet
 */
@WebServlet("/SumarServlet")
public class SumarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumarServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//OBTENER LOS PARAMETROS DEL FORMULARIO
		//int num1 = Integer.parseInt(request.getParameter("num1"));
		//int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int resultado = ServicioCalculadora.sumar(2, 2);
		
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("/index.jsp").forward(request, response);;
	}

}
