package com.class3ifElse;

//import java.util.Scanner;

public class scannewclass4 {
public static void main(String[] args) {
	int userWorked=4;
	//int bonus=5000;
	double salaray=40000;
	//Scanner love=new Scanner (System.in);
	
	if (userWorked>=5) {
		System.out.println("Eligible for the bonus");
		if (salaray>50000) {
			System.out.println("you get $5000 bonus");
		}else {
			System.out.println("you get $3000 bonus");
		}
	}else {
		System.out.println(" you are not eligable ");
	}
	
}
	
	
}
