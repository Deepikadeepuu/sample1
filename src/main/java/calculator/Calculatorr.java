package calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculatorr extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		String operation=req.getParameter("operation");
		switch(operation) 
		{
		case "add" :
		{
			int result=num1+num2;
			resp.getWriter().print("<h1 align='center> The sum is :"+result +"</h1>");
			break;
		}
		case "sub" :
		{
			int result=num1-num2;
			resp.getWriter().print("<h1 align='center> The Difference is :"+result +"</h1>");
			break;
		}
		case "mul" :
		{
			int result=num1*num2;
			resp.getWriter().print("<h1 align='center> The product is :"+result +"</h1>");
			break;
		}
		case "div" :
		{
			double result=num1/(double)num2;
			resp.getWriter().print("<h1 align='center> The division is :"+result +"</h1>");
			break;
		}
		
		}
	}
}
