package com.revature.models;

import java.util.Objects;

import com.revature.annotations.*;

@Table(tableName="employees")
public class Employees {
	
	@Id()
	@Column(columnName="emp_id")
	private int empId;
	@Column(columnName="first_name")
	private String firstName;
	@Column(columnName="last_name")
	private String lastName;
	@Column(columnName="user_name")
	private String userName;
	@Column(columnName="pass_word")
	private String passWord;
	@Column(columnName="emp_age")
	private int age;
	@Column(columnName="active")
	private boolean active;
	public Employees() {}
	public Employees(String firstName, String lastName, String userName, String passWord, int age, boolean active) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.active = active;
	}
	public Employees(int empId, String firstName, String lastName, String userName, String passWord, int age,
			boolean active) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.active = active;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public int hashCode() {
		return Objects.hash(active, age, empId, firstName, lastName, passWord, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return active == other.active && age == other.age && empId == other.empId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(passWord, other.passWord) && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", passWord=" + passWord + ", age=" + age + ", active=" + active + "]";
	}
	
	
}
