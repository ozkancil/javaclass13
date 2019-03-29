package com.class3ifElse;

import java.util.Scanner;

public class newTaskscan2 {
	public static void main(String[] args) {
		/*int age=18;
		int age2;
		Scanner age1=new Scanner (System.in);
		System.out.println("Enter age");
		
		age2=age1.nextInt();
		
		if (age2<=age){
			System.out.println("dont issue driver licence");
		}else {
			System.out.println("issue driver licence");
		}
		
		String city;
		int temp;
		
		Scanner love=new Scanner (System.in);
		System.out.println("enter city name ");
		
		city=love.nextLine();
		
		System.out.println("enter temp");
		
		temp=love.nextInt();
		
		int convertedtemp=(temp-32)*5/9;
		
		System.out.println("my converted temp is" + convertedtemp);
		
	*/
	System.out.println();
	System.out.println();
	System.out.println();
	
	int age3 =65;
	int eligibleage=16;
	int retirementage=64;
	
	if (age3<eligibleage) {
		System.out.println("you are too young dont work");
	}else {
		System.out.println("you are eligible to work");
	if (age3<retirementage) {
		System.out.println("go work hard");
	}else {
		System.out.println("please enjoy your life. you dont need to wrk");
	}
	
	}
		System.out.println();
		double gpa=3.6;
		double expectedgpa=3.7;
		
		boolean hasDiploma=true;
		
		
		if (hasDiploma) {
			System.out.println("Congratualations");
			if (gpa>expectedgpa) {
				System.out.println("you are hired");
			}else {
				System.out.println("unfortunately we cannot hire you");
			}
		}else {
			System.out.println("please get your diploma");
		}
		
		double pnt=3.6;
		double pnt1=2.5;
		
		boolean diploma=false;
		
		if (diploma) {
			System.out.println("good job");
		if (pnt1>pnt) {
			System.out.println("you are hired");
		}else {
			System.out.println("sorry cant hire you");
		}
		}else {
			System.out.println("get diploma");
		}
			
		System.out.println();
		
		double sc=3.6;
		double sc1=2.4;
		
		boolean degree=false;
		
		if (degree) {
			System.out.println("come in");
			if (sc>sc1) {
				System.out.println("your really good");
			}else {
				System.out.println("your not so bad");
			}
			
		}else {
			System.out.println("print with no degree, so get one");
		}
		
		}
		
	}


