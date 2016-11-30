package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2package.CreateNewTable;
import h2package.InsertIntoTable;




public class InitServlet extends HttpServlet{
	
	private String nomPais, idiomaDisponible, nuevoIdioma;
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Getting data 
		nomPais = RecoverData.fromPais(req, resp);
		idiomaDisponible = RecoverData.fromIdiomaDisponible(req, resp);
		nuevoIdioma = RecoverData.fromNuevoIdioma(req, resp);
		
		//Set values from datos.jsp in fin.jsp 
		req.setAttribute("country", nomPais);
		req.setAttribute("language", idiomaDisponible);
		req.setAttribute("newLanguage", nuevoIdioma);
		
		//Create table 
		CreateNewTable.createTablePais(); 
		CreateNewTable.createTableIdioma(); 
		
		//Insert into table 
		InsertIntoTable.insertTablePaises(nomPais); 
		InsertIntoTable.insertTableIdiomas(nuevoIdioma, nomPais);//Inserta Idioma, sino, lo actualiza
		
		req.getRequestDispatcher("End.jsp").forward(req, resp);
		  
		super.doPost(req, resp);
		
		redirect(resp);	 
		
	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
	}
	 
	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("End.jsp");
	}
	
}
