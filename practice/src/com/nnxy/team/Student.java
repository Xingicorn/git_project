package com.nnxy.team;

public class Student {
 
	private int age;//年龄
	private int id;//ID
	private String username;//姓名
	private String password;//密码
	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	public Student(int age, int id, String username, String password) {
		super();
		this.age = age;
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
