package com.revature.models;

import java.util.Objects;

import com.revature.annotations.Column;
import com.revature.annotations.Id;
import com.revature.annotations.Table;

@Table(tableName="customer")
public class Customer {
	
	@Id()
	@Column(columnName="cust_id")
	private int custId;
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
	public Customer() {}
	public Customer(String firstName, String lastName, String userName, String passWord, int age, boolean active) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.active = active;
	}
	public Customer(int custId, String firstName, String lastName, String userName, String passWord, int age,
			boolean active) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.age = age;
		this.active = active;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
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
		return Objects.hash(active, age, custId, firstName, lastName, passWord, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return active == other.active && age == other.age && custId == other.custId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(passWord, other.passWord) && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", passWord=" + passWord + ", age=" + age + ", active=" + active + "]";
	}
	
	
	
}
