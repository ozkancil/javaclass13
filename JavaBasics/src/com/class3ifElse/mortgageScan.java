package com.class3ifElse;

import java.util.Scanner;

public class mortgageScan {
	public static void main(String[] args) {

		//
		
		
		double bankRate = 4.5;
		double price = 2000000;
		double userRate;
		double housee;
		Scanner mortgage = new Scanner(System.in);
		System.out.println("check if rate is higher");

		userRate = mortgage.nextDouble();

		System.out.println(" house amount");

		housee = mortgage.nextDouble();

		if (bankRate>userRate ) {
			System.out.println("do not buy house");

		} else {
			
			System.out.println("consider buying it");
			
			if (housee <price) {
				System.out.println("take loan");
			} else {
				System.out.println("pay with cash");
			}
		}

	}
}
