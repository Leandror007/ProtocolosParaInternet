package iftm;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listar")
public class ListarTodos extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		response.setContentType("text/html");
		saida.print("<a href=index.html>INICIO</a><br><br>");
		saida.print("<table border=1><tr><th style=\"width: 150px\">Segunda</th> <th style=\"width: 150px\">Terça</th><th style=\"width: 150px\">Quarta</th><th style=\"width: 150px\">Quinta</th><th style=\"width: 150px\">Sexta</th></tr>");
		for (int linha = 1; linha < 5; linha++) {
			saida.print("<tr>");
			for (int coluna = 1; coluna < 6; coluna++) {
				int slot = ((linha - 1) * 5 + coluna);
				Dados nome = Banco.carregaRegistro(slot);
				if(nome.nome != null)
					saida.print("<td>" + nome.nome +" <a href=excluir?slot=" + slot + ">Excluir</td>");
				else	
					saida.print("<td><a href=marcar?slot=" + slot + ">Marcar</td>");
			}
			saida.print("</tr>");
		}
		saida.print("</table>");
	}
}
