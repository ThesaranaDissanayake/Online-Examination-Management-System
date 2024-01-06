package st;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class DISPLAYRESULTS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); // session 
		String username = (String)session.getAttribute("result");// pass the session id with user login username
	
		System.out.println(session.getAttribute("result"));
		System.out.println("Usernamesession = "+ username);
		
		RESULTS res = STUDENTDBUTILL.getMarks(username);
		request.setAttribute("res",username);
				
		RequestDispatcher dis = request.getRequestDispatcher("DisplayResults.jsp"); // send to manager display
		dis.forward(request, response);
			
		
	} 

}
