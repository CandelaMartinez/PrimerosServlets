package es.pildorasinformaticas.servletspruebas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PrimerServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//especifico formato de respuesta
		
		PrintWriter salida= response.getWriter();
		
		//generar respuesta de la peticion
		
		salida.println("<htm><body>");
		salida.println("<h1 style='text-align:center'>Prueba servlet</h1>");
		salida.println(" ");
		salida.println(" ");
		salida.println(" ");
		salida.println("fecha y hora"+ new Date());
		salida.println("</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
