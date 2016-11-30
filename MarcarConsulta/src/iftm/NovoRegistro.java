package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/marcar")
public class NovoRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			int slot = Integer.parseInt(request.getParameter("slot"));
			Dados cliente = Banco.carregaRegistro(slot);
			PrintWriter saida = response.getWriter();
			
			if(cliente.nome==null) {
				response.setContentType("text/html");
				saida.println("<form action=marcar method=post>");
				saida.println("Nome: <input name=nome>"); 
				saida.println("<input type=hidden name=slot value=" + slot + ">");
				saida.print("<input type=submit value=MarcarConsulta></form>");
			}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
				String nome = req.getParameter("nome");
				int slot = Integer.parseInt(req.getParameter("slot"));
				Dados novo = new Dados(slot, nome);
				Banco.gravaDados(novo);
				resp.sendRedirect("listar");
	}
		
}

