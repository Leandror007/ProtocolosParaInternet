package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public Calculadora() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		
		String[] adicao = request.getParameterValues("adicao");
		String[] subtracao = request.getParameterValues("subtracao");
		String[] divisao = request.getParameterValues("divisao");
		String[] multiplicacao = request.getParameterValues("multiplicacao");
		
		Integer numero1 = Integer.parseInt(request.getParameter("numero1"));  
		Integer numero2 = Integer.parseInt(request.getParameter("numero2"));  
		// Integer soma = 0;
		
		String calcular = (request.getParameter("calcular"));
		
		switch(calcular){
			case "adicao":
				saida.print("Resposta: "+ (numero1 + numero2));
    		break;
    		
			case "subtracao":
				saida.print("Resposta: "+ (numero1 - numero2));
    		break;
    		
			case "divisao":
				saida.print("Resposta: "+ (numero1 / numero2));
    		break;
    		
			case "multiplicacao":
				saida.print("Resposta: "+ (numero1 * numero2));
    		break;
		}
		
		
		/*
		if(String[].class.equals("adicao")){
			Integer soma = (numero1 + numero2);	
			saida.print("Resposta: "+ soma);	
		}
		else if(String[].class.equals("subtracao")){
			Integer soma = (numero1 - numero2);
			saida.print("Resposta: "+ soma);	
		}
		else if(String[].class.equals("divisao")){
			Integer soma = (numero1 / numero2);
			saida.print("Resposta: "+ soma);	
		}
		else if(String[].class.equals("multiplicacao")){
			Integer soma = (numero1 * numero2);
			saida.print("Resposta: "+ soma);	
		}
		
		*/	
	      
	
}

}
	


