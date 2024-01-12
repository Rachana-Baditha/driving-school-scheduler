package src;
import java.util.*;

public class MainSystem {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Driving School\n\nPlease Login to Continue:");
		
		User theUser = LoginSystem.executeLoginScreen(keyboard);
		
		if( theUser != null) {
			
			System.out.print("Login Success!");
			
			System.out.print("Hello " + theUser.getName());
			
			while(theUser.getSystemOptions(keyboard)) {} // Different depending on the user type
		}
		else {
			System.out.print("Login Failed");
		}
		
		
	}

}
