package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2.DeleteFromTable;


public class DeleteAuthenticationServlet extends HttpServlet{
	
	private String nom;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cToDelete = req.getParameter("cToDelete");
		
		req.setAttribute("country", cToDelete);
		
		req.getRequestDispatcher("EndDelete.jsp").forward(req, resp);
		
		super.doPost(req, resp);
		 
		redirect(resp);

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
		resp.sendRedirect("EndDelete.jsp");
	}
	
}
