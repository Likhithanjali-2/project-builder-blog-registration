package model;

import java.time.LocalDateTime;

public class User{
	String email,password;
	LocalDateTime date;
	public User(String email,String password,LocalDateTime date){
		this.email = email;
		this.password = password;
		this.date = date;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getEmail(){
		return this.email;
	}
	public String getPassword(){
		return this.password;
	}
	public LocalDateTime getDate() {
		return this.date;
	}
	
	
}