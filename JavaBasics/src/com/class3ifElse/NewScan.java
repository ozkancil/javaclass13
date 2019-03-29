package com.class3ifElse;

import java.util.Scanner;

public class NewScan {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner newScanner=new Scanner(System.in);
		System.out.println("please enter first numb ");
		
		num1=newScanner.nextInt();
		System.out.println("please enter second number");
		
		num2=newScanner.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1>num2) {
			System.out.println(num1+"is larger than "+ num2);
		}else if (num2>num1){
			System.out.println(num1+"is smaller than "+num2);
			
		}else {
			System.out.println(num1+"i equal to"+num2);
		}
		System.out.println("i am done");
	}

}
