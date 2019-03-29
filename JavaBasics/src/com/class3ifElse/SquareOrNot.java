package com.class3ifElse;

public class SquareOrNot {
public static void main(String[] args) {
	int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
	
	boolean isTrue=false;
	
	for (int i = 0; i < a.length; i++) {
		if(a.length==a[i].length) {
			isTrue=true;
		}else {
			isTrue=false;
			break;
		}
		
	}System.out.println(isTrue);
	
	
	
	
	///////////////////////////////
	System.out.println("*************************");
	
	
	
	
	
	{
	
	double[][] b = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1,3,4,3}
		};
	boolean ans=true;
	for (int i = 0; i < b.length; i++) {
		
			if (b.length==b[i].length) {
				ans=true;
			}else {
				ans=false;
			}
		}
		System.out.println(ans);
		
	}
}
}
