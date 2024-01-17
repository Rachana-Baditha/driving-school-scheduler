package src;
import java.util.*;

public class MainSystem {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		Database database = new Database();
		
		System.out.println("Welcome to Driving School\n\nPlease Login to Continue:");
		
		User theUser = LoginSystem.executeLoginScreen(keyboard, database);
		
		if( theUser != null) {
			
			for(int i=0; i<20; i++) {
				System.out.println("...");
			}
			
			System.out.println("Login Success!\n");
			
			System.out.println("Hello " + theUser.getName());
			
			while(theUser.getSystemOptions(keyboard, database)) {} // Different depending on the user type
		}
		else {
			System.out.print("Login Failed");
		}
		
		
	}

}
