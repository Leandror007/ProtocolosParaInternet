package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario
 */
@WebServlet("/servlet1")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td width=250>Nome</td><td width=250>" + request.getParameter("nome") + "</td>");
		out.println("<tr>");
		out.println("<td width=50>Sexo</td><td width=150>" + request.getParameter("sexo") + "</td>");
		out.println("<tr>");
		out.println("<td width=50>Faixa etária</td><td width=150>" + request.getParameter("faixa") + "</td>");
		out.println("<tr>");
		out.println("<td width=50>Como se locomove pela cidade</td><td width=150>");
		String[] valores = request.getParameterValues("locomocao");
		for (int i = 0; i < valores.length; i++) {
			out.print(valores[i]);
			if (i < valores.length - 1)
				out.print(", ");
		}
		out.print("</td>");

		out.println("</table>");
	}

}
