package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class add extends GenericServlet{
	@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			int x=(Integer.parseInt(req.getParameter("val1")));
			int y=(Integer.parseInt(req.getParameter("val2")));
			int z=x+y;
			
			res.getWriter().print("<h1>The addition of "+x+" and "+y+" is :"+z+"</h1>");
			
		}

		

}
