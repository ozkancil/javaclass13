package com.class2;

public class VariableChange {
	public static void main(String[] args) {
//   2/17/19
		//values of variables can be changed
		String name = "John";
		System.out.println(name);
		String lastName = "johnson";
		char grade = 'B';
		// char grade='A'; does not work
		grade = 'A';
		// it will execute A because the order matters and the last grade was replaced
		// with A.

		String city = "Fairfax";
		
		System.out.println(city);
		
		city = "New_York";
		
		city = "NewJersey";
		
		System.out.println(grade);
		
		System.out.println(city);
System.out.println(lastName);
	}
}
