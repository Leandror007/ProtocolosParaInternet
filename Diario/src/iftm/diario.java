package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/diario")
public class diario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public diario() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida = response.getWriter();
		String nome = request.getParameter("nome");
		String cidade = request.getParameter("cidade");
		String pais = request.getParameter("pais");
				
	
		saida.println("<table border=1>");
		saida.println("<tr>");
		saida.println("<td width=250>Nome:</td><td width=250>" + request.getParameter("nome") + "</td>");
		saida.println("<tr>");
		saida.println("<td width=50>Cidade:</td><td width=150>" + request.getParameter("cidade") + "</td>");
		saida.println("<tr>");
		saida.println("<td width=50>Pais:</td><td width=150>" + request.getParameter("pais") + "</td>");
		saida.println("<tr>");
	}

	
}
