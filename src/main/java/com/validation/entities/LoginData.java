package com.validation.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	@NotBlank(message="User name can not be empty!")
	@Size(min=3, max=12, message="User Name must be between 3-10 charachters!")
	private String userName;
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid email")
	private String email;
	@AssertTrue(message="Terms and Condition must be agreed!")
	private boolean aggree;
	public boolean isAggree() {
		return aggree;
	}
	public void setAggree(boolean aggree) {
		this.aggree = aggree;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	


}
