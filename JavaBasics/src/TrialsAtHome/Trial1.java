package TrialsAtHome;

import java.util.Scanner;

public class Trial1 {
	public static void main (String [] args) {
		
		/*/*Ask user to enter the item they want to buy and  the price for the item.
		Then ask user to pay for it. 
		Every time user enters money accumulate the amount 
		and tell user how much is left to pay off the amount. 
		Whenever user done with payments tell them 
		"Thank you for shopping!"
		*/
		
	Scanner scann=new Scanner (System.in);
		
		System.out.println("enter item you want to buy");
		String buy=scann.next();
		System.out.println("enter price for the item");
	double price=scann.nextInt();
		
	double sum=0;
		
	double pay=0;
		do {
			System.out.println("Please pay for it");
			pay=scann.nextDouble();
			sum=sum+pay;
			if (sum<price) {
			
			System.out.println("you need to pay more $ "+(price-sum));
			}
			
		}while ( sum<price);
		if (sum>price) {
			System.out.println("your change is $ "+(sum-price)+"-->Enjoy your item");
		}else {
			System.out.println("Enjoy your item");
		}
	}

}
