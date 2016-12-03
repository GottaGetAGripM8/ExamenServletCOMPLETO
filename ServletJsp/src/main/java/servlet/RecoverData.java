package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RecoverData extends HttpServlet{
	
	public String fromPais(HttpServletRequest req) throws ServletException, IOException {
		return req.getParameter("Ncountry").toString();
	} 
	
	public String fromNuevoIdioma(HttpServletRequest req) throws ServletException, IOException {
		return req.getParameter("Nlanguage").toString();
	}
	
	public String fromIdiomaDisponible(HttpServletRequest req) throws ServletException, IOException {
		return req.getParameter("AvaliableLang").toString();
	}   
	
}  