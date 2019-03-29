import java.util.Scanner;

public class newClassforSn1 {
public static void main(String[] args) {
	/*String cityName;
	double temp;
	
	Scanner newTask=new Scanner(System.in);
	System.out.println("print city name");
	
  cityName= newTask.nextLine();
   System.out.println("please enter temp");
  temp=newTask.nextDouble();
  */
	int loan1=2000000;
	int loan2;
	Scanner loan=new Scanner (System.in);
	System.out.println("enter loan amount");
	
	//loan1 =loan.nextInt();
	
	//System.out.println("enter second amount ");
	
	loan2=loan.nextInt();
	
	if (loan2<loan1) {
		System.out.println("lend the money");
	}else {
		System.out.println("reject the money");
	}
	
	
  
}
}
