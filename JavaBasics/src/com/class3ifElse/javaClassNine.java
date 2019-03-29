package com.class3ifElse;

import java.util.Scanner;

public class javaClassNine {

	public static void main(String[] args) {
		
    /*Write a program that reads a range of integers (start and end point), provided 
      * by a user and then from that range prints the sum of the even and odd integers.
		 */
//		
//		Scanner scan=new Scanner (System.in);
//		
//		System.out.println("Enter your first number");
//		int num1=scan.nextInt();
//		
//		System.out.println("Enter you end number");
//		double num2=scan.nextDouble();
//		int sumEven=0;
//		int sumOdd=0;
//		for (int i=num1; i<=num2;i++) {
//			if (i%2==0) {
//				sumEven+=i;
//				//System.out.println("your even numbers "+sumEven);
//			}else if (i%2!=0){
//				sumOdd+=i;
//			//System.out.println("your odd numbers "+sumOdd);
//				
//			}
//			
//		}
//		System.out.println("your even numbers "+sumEven);
//		System.out.println("your odd numbers "+sumOdd);
		
		
		
		
		
		
		
		/*Ask user to enter the item they want to buy and  the price for the item.
		Then ask user to pay for it. 
		Every time user enters money accumulate the amount 
		and tell user how much is left to pay off the amount. 
		Whenever user done with payments tell them 
		"Thank you for shopping!"
		*/
		
		
//		Scanner scann=new Scanner (System.in);
//			
//			System.out.println("enter item you want to buy");
//			String buy=scann.next();
//			System.out.println("enter price for the item");
//		double price=scann.nextInt();
//			
//		double sum=0;
//			
//		double pay=0;
//			do {
//				System.out.println("Please pay for it");
//				pay=scann.nextDouble();
//				sum=sum+pay;
//				if (sum<price) {
//				
//				System.out.println("you need to pay more $ "+(price-sum));
//				}
//				
//			}while ( sum<price);
//			if (sum>price) {
//				System.out.println("your change is $ "+(sum-price)+"-->Enjoy your item");
//			}else {
//				System.out.println("Enjoy your item");
//			}
//		

//		
//		Scanner scann=new Scanner (System.in);
//		System.out.println("What item are you buying?");
//		String item=scann.next();
//		
//		System.out.println("The price of the item is ");
//		int price=scann.nextInt();
//		
//		int sum=0;
//		int pay;
//		do {
//			System.out.println("Pay for the item");
//			pay=scann.nextInt();
//			sum+=pay;
//			if (sum<price) {
//				System.out.println("you owe "+(price-sum));
//			}else if (sum>price) {
//				System.out.println("Your change is $"+(sum-price)+". Thank you for shopping with us!");
//				
//			}
//			
//			
//		}while (sum<price);
//		if (sum>=price) {
//		System.out.println("Have a great day!");
//		
//	}else {
//			System.out.println("keep paying up");
//		}
//
//			}


		
	
		
		
		
		
		
		
		
		
		
		

		
		
		/*Print the following pattern:
1
12
123
1234
12345
*/
		

//for (int i=1;i<=5;i++) {//1 //2//3
//	
//	for (int y=1; y<=i; y++) {
//		
//		System.out.print(i);//1//22//333
//	}
//	System.out.println();
//}










		
/*Print the following pattern:
*
**
***
****
*****
****
***
**
*
*/

//
//for (int i=1;i<=5;i++) {
//	
//for (int y=1; y<=i; y++) {
//	
//	System.out.print("*");
//}
//
//	System.out.println();
//}
//for (int i=5;i>=1;i--) {
//	
//for (int y=1; y<i; y++) {
//System.out.print("*");	
//}
//System.out.println();
//}




		
/*Write a guessing game where the user has to guess a secret number between 1 and 20.
 *  After every guess input,
 *   the program tells the user whether their number was too large
*    or too small. 
 *    The program will keep asking the user to enter the number until he finds the correct number. 
 *    When the correct answer is found the system should display "Congratulations!!. You got it!".
 * */
		 
//Scanner scann=new Scanner (System.in);
//
//		for (int i=1;i<=20;i++) {
//			System.out.println("Enter guess number");
//			int guess=scann.nextInt();
//
//			if (guess>10) {
//			System.out.println(guess+" is too larger");	
//			}else if (guess<10) {
//				System.out.println("its to small");
//			}else if (guess==10){
//				System.out.println("congratulations");
//				
//			}
//			}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		







		
/*Ask a user to input a leap year. 
 * Give the user 10 chances to enter a correct leap year.
 *  As soon as the user enters the correct leap year exit the loop.
 */
		
		
//		
//	      Scanner scan;
//	        int year;
//	        
//	        scan=new Scanner(System.in);
//	        
//	        for (int i=0; i<10; i++) {
//	            
//	            System.out.println("Please enter a guessed leap year");
//	            year=scan.nextInt();
//	            
//	            //if year is divisible by 400--> leap year
//	            //if year is divisible by 100--> not a leap year
//	            //if year is divisible by 4--> a leap year
//	            //(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
//	            
//	            if (year%400==0) {
//	                System.out.println("Year is a leap year");
//	                break;
//	            }else if (year%4==0 && year%100!=0) {
//	                System.out.println("Year is a leap year");
//	                break;
//	            }else {
//	                System.out.println("Year is a NOT leap year");
//	            }
//	            
//	        }
	    
	
		/*draw this: ********
		 *           *      *
		 */  //      *      *
             //      *      *
             //      *      *
             //      ********      
		

//		for (int i=0; i<4; i++) {
//			for (int y=0; y<=i; y++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
		
//		for (int i=1; i<=4;i++) {
//			 
//				for (int y=1;y<=6;y++) {
//					if (i==1 || i==4 || y==1|| y==6) {
//					System.out.print("*");
//					
//				}else { System.out.print(" ");
//					
//				}
//				
//			}
//			System.out.println();
		
		
		
		
		
		
		
		
		
		
		

}

}
