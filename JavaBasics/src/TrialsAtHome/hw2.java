package TrialsAtHome;

public class hw2 {
public static void main(String[] args) {
	
	/*boolean a=false;
	boolean b=false;
	
	
	if (b) {
		System.out.println("condition is true");
	}
	else if (b && a) {
		System.out.println("a and b is true");
		
	}
	else if (a ||b) {
		System.out.println("a or be are true");
		}
	else { 
		System.out.println("a and b are false");
	}
	}
	*/
boolean gameover=true;
int score=8000;
int levelcompleted=5;
int bonus=100;
//
//if (score<5000 || score>1000) {
//	System.out.println("Your score was 5000 greater than 1000 ");
//}else if (score<1000) {
//	System.out.println("your score is less than 1000");
//	
//}else {
//	System.out.println("got here");
//}
	if (gameover==true) {
		int finalscore= score + (levelcompleted+ bonus); 
		System.out.println(finalscore); //int under if is called a scope
		
	}
	boolean gameover1=false;
	int score1=10000;
	int levelcompleted1=8;
	int bonus1=200;
	
	
      calculateScore ();

		}
	

	


	
public static void calculateScore () {
	
	
	boolean gameover1=true;
	int score1=10000;
	int levelcompleted1=8;
	int bonus1=200;
if (gameover1) {
	System.out.println("its a big number");
	if (score1>10) {
		System.out.println("this is it");
		if (levelcompleted1<10) {
			int finalscore=score1%bonus1;
			System.out.println(finalscore);
	
		}}}}
}

