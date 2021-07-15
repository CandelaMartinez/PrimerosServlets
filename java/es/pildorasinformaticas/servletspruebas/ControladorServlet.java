package es.pildorasinformaticas.servletspruebas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorServlet
 */
@WebServlet("/ControladorServlet")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//informacion proporcionada por una bbdd
		String [] participantes= {"juan","sara","pepe"};
		
		//creo el request de la peticion: nombre+valor, adjunto la informacion de la bbdd al objeto request
		request.setAttribute("lista_participantes", participantes);
		
		//creo objeto requestDispatcher para comunicar con el jsp e enviarle la info
		RequestDispatcher misDis= request.getRequestDispatcher("/VistaJSP.jsp");
		
		//enviar esa informacion al archivo jsp
		misDis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
