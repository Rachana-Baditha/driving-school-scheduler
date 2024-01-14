package src;

import java.util.*;

public class Database {
	
	private List<User> userlist;
	private List<InCarSession> drivingschedule;

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	
	public static List<User> loadUserlist() {
		
		ArrayList<User> allUsers = new ArrayList<User>();
		
		return allUsers;
		
	}

}
