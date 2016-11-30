package servletpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import h2package.SelectFromTable;
import utilpackage.Idioma;;


public class TableIdiomasServlet extends HttpServlet {
	List<Idioma> listAllUsers = new ArrayList<Idioma>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllUsers = SelectFromTable.SelectTableIdiomas();
		req.setAttribute("listAllUsers", listAllUsers);
		redirect(req,resp);
		
		super.doPost(req, resp);
	}

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/TableUsers.jsp");
		dispatcher.forward(req,resp);
		
	}
}
