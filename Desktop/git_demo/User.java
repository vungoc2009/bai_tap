package com.learncode.Models;

import java.util.Objects;

public class User {
	private String username;
	private String password;
	private String fulllname;
	private int age;
	private boolean gender;
	public User(String username, String password, String fulllname, int age, boolean gender) {

		this.username = username;
		this.password = password;
		this.fulllname = fulllname;
		this.age = age;
		this.gender = gender;
	}
	public User() {
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFulllname() {
		return fulllname;
	}
	public void setFulllname(String fulllname) {
		this.fulllname = fulllname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
