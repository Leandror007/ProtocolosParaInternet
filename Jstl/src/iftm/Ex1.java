package iftm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1
 */
@WebServlet("/Ex1")
public class Ex1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] strings = new String[3];
		strings[0] = "saturno";
		strings[1] = "marte";
		strings[2] = "venus";
		request.setAttribute("planetas", strings);
		
		RequestDispatcher despacho = getServletContext().getRequestDispatcher("/jstl1.jsp");
				despacho.forward(request, response);
	}
}
