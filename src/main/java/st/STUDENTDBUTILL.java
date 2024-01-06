package st;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class STUDENTDBUTILL {
	
	private static boolean isCorect;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	//Login Validate function
	public static boolean validate(String username , String Password) {
		
		
		
		try {
			
			//Database connection using DBconnect class
			con= DBConnect.getConnection();
			stmt=con.createStatement();
			
			////selecting values from the database table
			
			String sql = "select * from St_details where id='"+username+"' and password='"+Password+"' ";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				
				isCorect=true;
				
			}
			else {
				
				isCorect=false;}
			
			
		}catch(Exception e) {
			System.out.println("kusername="+username+"\nkPassword="+Password);
			e.printStackTrace();//display relevent 
			
		}
		
		return isCorect;
			
	}
	



public static STUDENT getStudent(String username) { 
	
	//creating object using Manager class
	STUDENT Student = new STUDENT();
		
				
		try {
			
			//DB connection
				Class.forName("com.mysql.jdbc.Driver");
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				//selecting specific data from the table
				
				String sql = "SELECT * FROM St_details WHERE id = '"+username+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
				
					//setting database table values into the Manager properties using setters
					
				Student.setId(rs.getString("id"));
				Student.setName(rs.getString("name"));
				Student.setEmail(rs.getString("email"));
				Student.setPhone(rs.getString("Phone"));
				Student.setDob(rs.getString("dob"));
				Student.setUname(rs.getString("id"));
				Student.setPassword(rs.getString("Password"));
							
				}
			
			
			
		}catch (Exception e) {
			System.out.println("not get deta from DB");
			e.printStackTrace();
		}
		
			return Student;
}

public static RESULTS getMarks(String username) { 
	
	//creating object using Manager class
	RESULTS marks = new RESULTS();
		
				
		try {
			
			//DB connection
				Class.forName("com.mysql.jdbc.Driver");
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				//selecting specific data from the table
				
				String sql = "SELECT * FROM result_m1 WHERE id = '"+username+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
				
					//setting database table values into the Manager properties using setters
					
					marks.setId(rs.getString("id"));
					marks.setmName(rs.getString("mName"));
					marks.setMarks(rs.getDouble("result"));
				
							
				}
			
			System.out.println("Sucess marks");
			
		}catch (Exception e) {
			System.out.println("not get deta from DB");
			e.printStackTrace();
		}
		
			return marks;
}



public static boolean viewSearchResult(String username) {
	
try {
			
			//DB connect
			con= DBConnect.getConnection();
			stmt=con.createStatement();
			
			//selecting specific data in the table
			
			String sql = "select * from result_m1 where id='"+username+"'";
			rs=stmt.executeQuery(sql);
			
			System.out.println("sucess"+ username);
			if(rs.next()) {
				
				isCorect=true;
				System.out.println("true");
			}
			else {
				
				isCorect=false;}
			
			
		}catch(Exception e) {
			
			System.out.println("unsucsess");
			e.printStackTrace();
			
		}
		
		return isCorect;
		
		
	}

public static boolean BookExam(String Uname,String Id,String Email ,String Year,String Semester, String phone , String ModuleName ) {
	
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		System.out.println("login");
		
		String sql = "insert into book_Exam values('"+Uname+"','"+Id+"','"+Email+"','"+Year+"','"+Semester+"','"+phone+"','"+ModuleName+"')";    
		int rs = stmt.executeUpdate(sql);
		
		if(rs >0) {
			isCorect = true;
		}
		else {
			isCorect = false;
		}
		
	} catch (SQLException e) {
		System.out.println("Database insert Erorr!");
		e.printStackTrace();
	}
	
	
	
	return isCorect;
	
	
}


}