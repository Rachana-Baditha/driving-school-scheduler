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
			if(user.getUsername() == tempUsername && user.getPassword() == tempPassword) {
				return user;
			}
		}
		
		return null;
		
		
	}
	

}
