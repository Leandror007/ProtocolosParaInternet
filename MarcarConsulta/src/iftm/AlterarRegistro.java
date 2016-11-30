package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alterar")
public class AlterarRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int slot = Integer.parseInt(request.getParameter("id"));
		Dados d = Banco.carregaRegistro(slot);
		PrintWriter saida = response.getWriter();
		response.setContentType("text/html");
		saida.println("<form action=alterar method=post>");
		saida.println("slot: <input name=slot value=" + d.getSlot() + ">");
		saida.println("Nome: <input name=nome value=" + d.getNome() + ">");
		
		saida.println("<input type=hidden name=slot value=" + slot + ">");
		saida.print("<input type=submit></form>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		
		int slot = Integer.parseInt(req.getParameter("slot"));
		Dados novo = new Dados(slot, nome);
		Banco.alteraDados(novo);
		resp.sendRedirect("listar");
	}
}
