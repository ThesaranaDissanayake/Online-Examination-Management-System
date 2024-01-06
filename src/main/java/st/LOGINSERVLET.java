package st;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class LOGINSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out  = response.getWriter(); 
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String Password = request.getParameter("pwd");
		

		boolean thatTrue;
		
		thatTrue= STUDENTDBUTILL.validate(username, Password);
		
		if(thatTrue == true) {
			
			STUDENT stses = STUDENTDBUTILL.getStudent(username);
			request.setAttribute("stses", stses);
			
			HttpSession session = request.getSession();
			session.setAttribute("login",stses.getUname());
			
			
			
			
			RequestDispatcher dis=request.getRequestDispatcher("Student_Home.jsp");
			dis.forward(request, response);
			
		}else {
			
			//showing error message
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is Incorrect!');");
			out.println("location='relogin.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}