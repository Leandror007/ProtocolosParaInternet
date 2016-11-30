package iftm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/pressao")
public class pressao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public pressao() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();

		String pressao = (request.getParameter("pressao"));
		
		int pressao1 = Integer.valueOf(pressao.replace(".", "").replace(",", "")).intValue();
		String classificacao = null;
		String reavaliacao = null;
		
				
			if(pressao1 <= 130){
				classificacao = "Normal";
				reavaliacao = "Reavaliar em 01 ano";
			}
			else if(pressao1 > 130 && pressao1 <= 139){
				classificacao = "Normal-Limitrofe";
				reavaliacao = "Reavaliar em 06 meses";
			}
		    if  (pressao1 > 140 && pressao1 <= 159)  {
				classificacao = "Hipertensao leve";	
				reavaliacao = "A cada 02 meses";
			}
			
		     if(pressao1 > 160 && pressao1 <= 179){
		    	 classificacao = "Hipertensao Moderada";
		    	 reavaliacao = "A cada 01 mes";
		    }
		     if(pressao1 >= 180){
				 classificacao = "Hipertensao Grave";
				 reavaliacao = "Imediato";
			}
		     
		    saida.println("<p>Valor "+ pressao1 + "</p><br><br>"); 
		     
		    saida.println("<p>Sua pressao é equivalente a "+ classificacao + "</p>");
		    saida.println("<a href='medirPressao.html'> <Reavaliação> </a>");
	//	}
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
