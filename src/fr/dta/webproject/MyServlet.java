package fr.dta.webproject;
import java.io.IOException;
import java.util.Date;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="AutreChose", urlPatterns= {"/MyServlet"})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.getWriter().append(
				"<html><head><link rel=\"stylesheet\" href=\"styles.css\" type=\"text/css\"> <head/><body> <p style='background-color: black; color: lightgreen; padding: 100px 70px 100px;'>Today is: "
						+ new Date() + "</p></body></html>");

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		Map m = req.getParameterMap();
		Set s = m.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();

			String key = entry.getKey();
			String[] value = entry.getValue();

			pw.println("Key is " + key + "<br>");

			if (value.length > 1) {
				for (int i = 0; i < value.length; i++) {
					pw.println("<li>" + value[i].toString() + "</li><br>");
				}
			} else
				pw.println("Value is " + value[0].toString() + "<br>");

			pw.println("-------------------<br>");
		}

		pw.close();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("password");
	
	}
}
