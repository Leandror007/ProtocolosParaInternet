package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Excluir
 */
@WebServlet("/excluir")
public class Excluir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Excluir() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		
	
		Carrinho car;
		car = (Carrinho) sessao.getAttribute("carrinho");
		
	//	String i = String(request.getParameter("car"));
	//	car.excluir(i);
		response.sendRedirect("carrinho.jsp");
	}



}

