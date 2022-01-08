package com.revature.models;

import com.revature.annotations.*;

@Table(tableName="employees")
public class Employees {
	private int empId;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private int age;
	private boolean active;
}
