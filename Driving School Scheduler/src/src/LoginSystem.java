package src;
import java.util.*;

public class LoginSystem {
	
	
	static User executeLoginScreen(Scanner keyboard, Database database) {
		
		String tempUsername;
		String tempPassword;
		
		System.out.println("Username: ");
		tempUsername = keyboard.nextLine();
		
		System.out.println("Password: ");
		tempPassword = keyboard.nextLine();
		
		for(User user: database.getUserlist()) {
			System.out.println(user.getUsername()+ " " +user.getPassword());
			if(user.getUsername().equals(tempUsername) && user.getPassword().equals(tempPassword)) {
				return user;
			}
		}
		
		return null;
		
		
	}
	

}
