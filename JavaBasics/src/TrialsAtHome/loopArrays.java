package TrialsAtHome;

public class loopArrays {
public static void main(String[] args) {
	String []arry= {"zero","one","two","three","four"};
	
	int count=0;
	for (int i=0; i<arry.length; i++) {
		if (arry[i].contains("e")) {
			count++;
			
		}
		
	}
	System.out.println(count);
	
String [] newArry=new String[count];	
int num=0;
System.out.println(count);
for(int i=0; i<arry.length;i++) {
	if (arry[i].contains("e")) {
		newArry[num]=arry[i];
		num++;
	}
}

for (int i=0; i<newArry.length;i++) {
System.out.println(newArry[i]);


//String array, right "java is fun" in the array. 
//look and see if its a palindrome. if its a palindrome print out its a palindrome. than write
//After try "ey edip adanada pide ye" in side the array []. if its a palidrome print palindrome, else its not a 
//palindrome

/* .equals
 * 
 * .equalsIgnoreCase(task).
*/


}

}}
