package st;

public class STUDENT {
	
	String Id;
	String name;
	String Email;
	String phone;
	String dob;
	String Uname;
	String password;
	
	

	public STUDENT() {
		
	}


	public STUDENT(String id, String name, String email, String phone, String dob, String uname, String password) {
		
		this.Id = id;
		this.name = name;
		this.Email = email;
		this.phone = phone;
		this.dob = dob;
		this.Uname = uname;
		this.password = password;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
