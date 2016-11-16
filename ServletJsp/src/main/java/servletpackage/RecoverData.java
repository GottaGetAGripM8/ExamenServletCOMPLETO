package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecoverData extends HttpServlet{
	
	public static String fromPais(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return req.getParameter("pais").toString();
	} 
	
	public static String fromNuevoIdioma(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return req.getParameter("nuevoIdioma").toString();
	}
	
	public static String fromIdiomaDisponible(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return req.getParameter("idiomaDis").toString();
	}  
	
} 