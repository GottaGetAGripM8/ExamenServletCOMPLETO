package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2.DeleteFromTable;


public class DeleteServlet extends HttpServlet{
	
	private String nom;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String countryToDelete = req.getParameter("cToDelete");
		
		DeleteFromTable.deleteTableIdiomas(countryToDelete);
		DeleteFromTable.deleteTablePaises(countryToDelete);
		
		redirect(resp); 
		
		super.doPost(req, resp);

	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String countryToDelete = req.getParameter("country");
				
		req.setAttribute("country", countryToDelete);
		
		DeleteFromTable.deleteTableIdiomas(countryToDelete);
		DeleteFromTable.deleteTablePaises(countryToDelete);
		
		redirect(resp);
		 
		redirect(resp);
		
		super.doPost(req, resp);
	}

	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("EndForm.jsp");
	}
	
}
