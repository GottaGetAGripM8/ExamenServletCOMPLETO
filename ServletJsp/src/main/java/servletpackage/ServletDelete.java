package servletpackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2package.DeleteFromTable;


public class ServletDelete extends HttpServlet{
	
	private String nom;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pBorrar = req.getParameter("nomB");
		
		//req.setAttribute("nom", pBorrar);
		
		DeleteFromTable.deleteTableIdiomas(pBorrar);
		DeleteFromTable.deleteTablePaises(pBorrar);
		
		//req.setAttribute("country", pBorrar);
		
		redirect(resp);
		
		super.doPost(req, resp);
		
		

	} 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
				
		req.setAttribute("nom", user);
		
		DeleteFromTable.deleteTableIdiomas(user);
		DeleteFromTable.deleteTablePaises(user);
		
		redirect(resp);
		 
		redirect(resp);
		
		super.doPost(req, resp);
	}

	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("EndForm.jsp");
	}
	
}
