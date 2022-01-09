package com.revature;

import com.revature.database.MakeDatabaseCalls;
import com.revature.inspection.ClassInspector;
import com.revature.models.Employees;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Simple ORM Implementation");

		ClassInspector CI = new ClassInspector();

		MakeDatabaseCalls DB = new MakeDatabaseCalls();

//		CI.listFields(Employees.class);
//		System.out.println(CI.getClassTableName(Employees.class));
//		DB.MakeTableReflection(Employees.class);
		
//		System.out.println(CI.getClassTableName(Employees.class));
		
		
//		"CREATE TABLE employees (emp_id SERIAL primary key, first_name VARCHAR, 
//		System.out.println(DB.testSqlString(Employees.class));
		
		CI.listPublicMethods(Employees.class);

	}

}
