package com.revature;

import com.revature.database.MakeDatabaseCalls;
import com.revature.models.Customer;
import com.revature.models.Employees;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Simple ORM Implementation");


		MakeDatabaseCalls DB = new MakeDatabaseCalls();


		
		
		System.out.println(DB.createTableFromClass(Employees.class));
//		System.out.println(DB.createSqlString(Employees.class));
		
//		System.out.println(DB.createSqlString(Employees.class));
		


	}

}
