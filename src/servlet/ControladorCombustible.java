package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorCombustible
 */
@WebServlet("/ControladorCombustible")
public class ControladorCombustible extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCombustible() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("gasoila")!= null) {
			

			response.sendRedirect("html/gracias.html");

		
	}
	
	
	if (request.getParameter("gasoila+") != null) {

		
			response.sendRedirect("html/gracias.html");}
			
			
			
			if (request.getParameter("gasolina95")!= null) {
				

				response.sendRedirect("html/gracias.html");}

			
		
		
		
		if (request.getParameter("gasolina98") != null) {

			
				response.sendRedirect("html/gracias.html");}		
		
		
	

	
	}
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
