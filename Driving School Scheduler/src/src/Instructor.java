package src;

import java.util.*;

public class Instructor extends User {
	
	String name;
	
	Instructor(String username, String password, String name){
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public String getName() {
		return this.name;
	}
	
	static boolean addDrivingSlot(Scanner keyboard) {
		try {
			System.out.println("Enter Date in format dd/mm:");
			String[] enterDate = keyboard.nextLine().split("\\/");
			
			InCarSession drivingSlot = new InCarSession();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	static boolean removeDrivingSlot() {
		// TODO
		return false;
	}
	
	static boolean printWeeklySchedule() {
		// TODO
		return false;
	}

	@Override
	boolean getSystemOptions(Scanner keyboard, Database database) {
		
		System.out.println("SELECT:\n1. ADD Driving Slot\n2. PRINT Weekly Schedule\n3. EXIT");
		
		String action = keyboard.nextLine();
		
		if( action == "1" || action == "ADD" ) {
			return addDrivingSlot(keyboard);
			
		}
		else if( action == "2" || action == "PRINT" ) {
			return printWeeklySchedule();
		}
		else if( action == "3" || action == "EXIT" ) {
			System.out.print("Are you sure you wish to EXIT? Y/N");
			
			String exitConfirm = keyboard.nextLine();
			
			if( exitConfirm == "Y" || exitConfirm == "") {
				
				System.out.println("EXIT confirmed. \nUser logged off");
				
				return false;
			}
			else {
				System.out.println("EXIT aborted.");
				return true;
			}
		}
		
		System.out.println("An unexpected event has occured. Exiting System...");
		
		
		
		return false;
		
	}

}
