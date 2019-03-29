import java.util.Scanner;

public class newscan1 {
	public static void main(String[] args) {
		 String cityName;
		 int temp;
		 Scanner myScanner=new Scanner(System.in);
		 System.out.println("Please enter your city name ");
		 
		 cityName=myScanner.nextLine()
;// allows us to capture it and dump it in the city name
		 
		 System.out.println("Please enter temperature in Fahrenheit");
		  
		temp=myScanner.nextInt();
		
		System.out.println(cityName+temp);
		
		//formula for (F-32)x5/9
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println(convertedTemp);
		
		System.out.println("the temp in the city "+cityName+" is "+convertedTemp+" celsius ");
		
		
	}
	

}
