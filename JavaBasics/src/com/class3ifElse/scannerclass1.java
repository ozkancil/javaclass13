package com.class3ifElse;

import java.util.Scanner;

public class scannerclass1 {
public static void main(String[] args) {
	//int num=22;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println(" Please enter your name");
	
	String name=input.nextLine();

	
	System.out.println("Good morning "+name);
	
	int num1=input.nextInt();
	
	System.out.println("I am this old "+num1);
	
	String urname=input.nextLine();
	System.out.println("write ur other name"+urname);
	
	int num2=input.nextInt();
	System.out.println("my new num is "+num2);
	
	
	
	
	
}
}
