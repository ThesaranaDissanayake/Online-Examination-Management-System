package st;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	
	private static String url="jdbc:mysql://localhost:3306/Student";
	private static String UserName="root";
	private static String Password="Dulaj@12";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//driver manager
			
			con=DriverManager.getConnection(url,UserName,Password);//getting connection
				
		}catch(Exception e) {
			
			System.out.println("Database connection is not success :"+ e);
			
		}
		
		
		return con;//returning connection
		
	}
	

}

