package com.class3ifElse;

import java.util.Scanner;

public class scanclass5 {
public static void main(String[] args) {
 int workedYear;
 int annualSalary;
   Scanner love=new Scanner(System.in);
   System.out.println("Number of years worked");
   workedYear=love.nextInt();
   
   System.out.println("What is your annual salary");
   annualSalary=love.nextInt();
   
   if (workedYear>=5) {
	   System.out.println("Eligible for the bonus");
	   if (annualSalary>50000) {
		   System.out.println("bonus of $5000");
	   }else {
		   System.out.println("bonus of $3000");
	   }
   }else {
	   System.out.println("not eligible");
   }
   
   double n=14;
   double b=2;
   int mod=(int) (n%b);
   System.out.println(mod);
   double mod1=29%4;
   System.out.println(mod1);
}
}
