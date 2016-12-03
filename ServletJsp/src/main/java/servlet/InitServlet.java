package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2.CreateNewTable;
import h2.InsertIntoTable;




public class InitServlet extends HttpServlet{
	
	private String countryName, avaliableLanguage, newLanguage;
	
	private RecoverData recoverData = new RecoverData();
	private CreateNewTable createNewTable = new CreateNewTable();
	private InsertIntoTable insertIntoTable = new InsertIntoTable();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		countryName = recoverData.fromPais(req, resp);
		avaliableLanguage = recoverData.fromIdiomaDisponible(req, resp);
		newLanguage = recoverData.fromNuevoIdioma(req, resp); 
		
		req.setAttribute("country", countryName);
		req.setAttribute("language", avaliableLanguage);
		req.setAttribute("newLanguage", newLanguage);
		 
		createNewTable.createTablePais(); 
		createNewTable.createTableIdioma(); 
		
		insertIntoTable.insertTablePaises(countryName); 
		insertIntoTable.insertTableIdiomas(newLanguage, countryName);
		
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
