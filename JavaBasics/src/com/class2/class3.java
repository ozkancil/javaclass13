package com.class2;

public class class3 {
	public static void main( String [] args) {
		int a =10;
		int b=3;
		 int div=a/b;
		 
	System.out.println(div);//3 or 3.3. use data type that offers the decimals
		
	
	//modules operator 
		
 int mod=a%b;
 System.out.println(mod);//% this gives us the reminder, the one that is left. 10/3 is 3.3, so 3 times 3 is 9 so then it means we have one left that leads us to 1, for this 
 //reason is its the left over. 
 
 int q=23;
 int w=11;
 System.out.println(q%w);

 int v=47;
 int c=5;
 
 System.out.println(v%c);//this is called the module operator and its the remainder 
 
 int as=19;
 int ab=20;
 
 boolean result=as>5;
 boolean result1=a==b;
 System.out.println(result);
 System.out.println(result1);
 
 //if its a different color its a reserved key word.
 
 if (as>ab) {
	 System.out.println("as is larger than ab");
 } else {
	 System.out.println("as is smaller than ab");
	 
 }
 
 //decalre price and if price is higher than expected price --> i will not but it
 
 double shoeprc1=29.99;
 double allowedprc2=31.99; 
 
 if (shoeprc1<=allowedprc2) {
	 System.out.println("I can buy the shoe");
 }else {
	 System.out.println(" I cannot buy this shoe"
	 		+ "");
 }
 
 
	}

}
