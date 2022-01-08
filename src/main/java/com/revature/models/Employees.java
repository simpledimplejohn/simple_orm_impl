package com.revature.models;

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
	@Column(columnName="age")
	private int age;
	@Column(columnName="active")
	private boolean active;
}
