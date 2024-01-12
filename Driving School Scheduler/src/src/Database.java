package src;

import java.util.*;

public class Database {
	
	private static List<User> userlist;

	public static List<User> getUserlist() {
		return userlist;
	}

	public static void setUserlist(List<User> userlist) {
		Database.userlist = userlist;
	}
	
	public static List<User> loadUserlist() {
		
		ArrayList<User> allUsers = new ArrayList<User>();
		
		return allUsers;
		
	}

}
