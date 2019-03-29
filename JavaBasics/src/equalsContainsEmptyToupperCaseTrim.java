import java.util.Scanner;

public class equalsContainsEmptyToupperCaseTrim {
public static void main(String[] args) {
	/*Accept username, password and confirm password and check following requirements:

		Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		Password should be minimum 8 characters, if less → message=”Password is too short”.
		Password cannot contain username if so, → message=”Password cannot contain username”.
		Password should match confirmed password, if not  → message “Passwords do not match”.
		Only after all requirements met → message “Your username and password has been created”
*/
	
	Scanner scan=new Scanner (System.in);
	System.out.println("enter username");
	String username=scan.next();
	int result = Integer.parseInt(username);
	
	System.out.println("enter password");
	int password=scan.nextInt();
	boolean testEmpty=username.isEmpty();
	//boolean isEmpty=password.isEmpty();
	
	if (!username.isEmpty() || password!=0) {
		if (password>8) {
			if (password!=result) {
				System.out.println("does not equal");
				if (password==(password)) {
					System.out.println("matches");
				}else {
					System.out.println("password does not match");
				}
				
			}else {
				System.out.println("cannot conains");
			}
			
		}else {
			System.out.println("to shore");
		}
		System.out.println("Username and password cannot be empty");
	}
		
	
}
}
