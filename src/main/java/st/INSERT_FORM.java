package st;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class INSERT_FORM extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Uname = request.getParameter("name");
		String Id = request.getParameter("id");
		String Email = request.getParameter("email");
		String Year = request.getParameter("Year");
		String Semester = request.getParameter("semester");
		String phone = request.getParameter("phone");
		String ModuleName = request.getParameter("module_name");
		
		boolean thatTrue;
		
		thatTrue = STUDENTDBUTILL.BookExam(Uname, Id, Email, Year, Semester, phone, ModuleName);
		
		if(thatTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("SucessRegister.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("UnsucessRegister.jsp");
			dis.forward(request, response);
		}
		
	}

}
