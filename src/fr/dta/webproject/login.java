package fr.dta.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("password");
		
		if(id != null && id.equals("id") && pwd != null && pwd.equals("password")) {
			RequestDispatcher rs = req.getRequestDispatcher("MyJSP.jsp");
			rs.forward(req, res);
		}else {
			out.println("mauvais identifiant fdp");
			RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
			rs.include(req, res);
		}
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	
	}
}
