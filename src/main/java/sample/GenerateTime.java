package sample;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/generate-time")
public class GenerateTime implements Servlet
{

	@Override
	public void init(ServletConfig config) throws ServletException {
	
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int hour=LocalDateTime.now().getHour();
		int Minute=LocalDateTime.now().getMinute();
		int Second=LocalDateTime.now().getSecond();
		res.getWriter().print( "<h1 style='color:green'; align='center'> The time is :"+hour+": "+Minute+" : "+Second+" </h1>");
		
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void destroy() {
		
		
	}

}
