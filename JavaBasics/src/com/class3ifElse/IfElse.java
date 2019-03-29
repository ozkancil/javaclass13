package com.class3ifElse;

public class IfElse {
	public static void main (String []args) {
		
		int a=198;
		int b=198;
		
		if (a!=b) {
			System.out.println("hello");
		
		
		}else {
			System.out.println("bye");
		}
		//declare price and if price is higher than expected price-> i will not buy it
		
		double shoesPrice=32.99;
		double allowedPrice=31.99;
		
		if (shoesPrice<=allowedPrice) {
			System.out.println(" buy shoes");
		
		}else {
			System.out.println("dont buy the shoe ");
		
		}
		
		 //!= != != != != != !=!= != != != != !=!=!=!= != != != 
	double comparison=120;
	double comparison1=110;
	
	if (comparison>comparison1) {
		System.out.println("Double value "+comparison+" is"
				+ "greater larger than "+comparison1);
	}else {
		System.out.println("come get me haha");
	}
	
	double tempCheck=32.1;
	double tmpcheck=30;
	 
	if (tmpcheck<tempCheck) {
		System.out.println("water will freeze with temperature "+
	tempCheck+"otherwise water will not freeze with temperature"+tmpcheck);
		
	}else {
		System.out.println("i am lost");
	}
	
	System.out.println();
	/*
	int num1=23;
	int num2=23;
	
	if (num1>num2) {
		System.out.println("23 is larger than 14");
		System.out.println("i have multiple lines to print");
		System.out.println("i am if block");
	}else {
		System.out.println("i am else block");
		System.out.println("num1 is smaller than num2 ");
	}
	*/
	
	int num1=23;
	int num2=213;
	
	if (num1>num2) {
		System.out.println("num1 is larger than num2");
		
	}else if (num1==num2) {
		System.out.println("num1 is equal to num2");
	}else {
		System.out.println("last resort");
	
	}
	System.out.println("im done with if condition");
	}

}
