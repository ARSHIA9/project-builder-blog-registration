package model;

import java.time.LocalDateTime;

//creating user class with 3 arguments
public class User{
	String email;
	String password;
	LocalDateTime date = LocalDateTime.now();
	
	//getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	//creating constructor with 3 arguments
	public User(String email, String password, LocalDateTime date) {
		super();
		this.email = email;
		this.password = password;
		this.date = date;
	}
	
	
	
}
