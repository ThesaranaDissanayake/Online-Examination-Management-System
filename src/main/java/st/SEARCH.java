package st;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SEARCH extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
		
		String search = request.getParameter("search");
		System.out.println(search);
		
		boolean thatTrue;
		
		thatTrue = STUDENTDBUTILL.viewSearchResult(search);
		
		if(thatTrue == true) {
			
			RESULTS result = STUDENTDBUTILL.getMarks(search);
			
		    
			HttpSession session = request.getSession();
			session.setAttribute("result", search);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("DisplayResults.jsp");
			dis.forward(request, response);
			
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("SearchNotValid.jsp");
			dis.forward(request, response);
		}
	}

}
