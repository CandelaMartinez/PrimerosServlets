package es.pildorasinformaticas.servletspruebas;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Clase247_RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegistroUsuarios() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//enviar respuesta al usuario con la informacion introducida en los campos
		//crear objeto printwriter para poder dar salida a la informacion y usar el obj response con el metodo getWriter
		PrintWriter salida= response.getWriter();
		
		salida.println("<html><body>");
		
		//getParameter con campo de texto nombre del formulario
		salida.println("Nombre introducido"+ request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducido"+ request.getParameter("apellido"));
		salida.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
