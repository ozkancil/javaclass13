package com.class3ifElse;

public class TwoDimensionArray {
public static void main(String[] args) {
	
//	int[][] a = {
//			{1,1,2}, //sum = 4
//			{3,1,2}, //sum = 6
//			{3,5,3}, //sum = 11
//			{0,1,2}  //sum = 3
//		};
//	
//	for (int i=0;i<a.length;i++) {
//		int sum=0;
//		for (int j=0;j<a[i].length;j++) {
//			sum+=a[i][j];
//			
//		}System.out.println(sum);
//	}

	
	
	//Write a program that prints the total number of elements that are negative AND odd
	
	int[][] b = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
//	int count=0;
//	for (int h=0;h<b.length;h++) {
//		
//		for (int y=0;y<b[h].length;y++) {
//			if (b[h][0]<0 && b[h][0]%2!=0) {
//				count+=1;
//				
//			}System.out.println(count);
//		}
//	}

	int count = 0;
	
	for (int[] x:b) {
		for (int c:x ) {
			if (c<0 && c%2!=0) {
				count+=1;
				
				
			}
		}
	}System.out.println(count);

	
}
}
