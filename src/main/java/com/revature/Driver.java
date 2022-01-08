package com.revature;

import com.revature.inspection.ClassInspector;
import com.revature.models.Employees;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Simple ORM Implementation");
		
		ClassInspector CI = new ClassInspector();
		
		CI.listFields(Employees.class);

	}

}
