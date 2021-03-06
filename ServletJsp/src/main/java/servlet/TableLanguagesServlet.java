package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2.SelectFromTable;
import model.Language;;


public class TableLanguagesServlet extends HttpServlet {
	private List<Language> listAllCountries = new ArrayList<Language>();
	private SelectFromTable selectFromTable = new SelectFromTable(); 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllCountries = selectFromTable.SelectTableLanguages();
		req.setAttribute("listAllCountries", listAllCountries);
		redirect(req,resp); 
		
		super.doPost(req, resp); 
	}

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TableLanguages.jsp");
		dispatcher.forward(req,resp);
	}
}
