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
		String cToDelete = req.getParameter("countryToDelete");
		
		req.setAttribute("country", cToDelete);
		
		req.getRequestDispatcher("EndDelete.jsp").forward(req, resp);
		
		super.doPost(req, resp);
		 
		redirect(resp);

	} 
	

	private void redirect(HttpServletResponse resp) throws IOException, ServletException {
		resp.sendRedirect("EndDelete.jsp");
	}
	
}
