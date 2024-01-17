package src;

import java.util.*;

public class Database {
	
	private List<User> userlist;
	private List<InCarSession> drivingschedule;
	
	Database(){
		this.userlist = loadUserlist();
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	
	public static List<User> loadUserlist() {
		
		ArrayList<User> allUsers = new ArrayList<User>();
		
		allUsers.add(new Instructor("DSmith0892","GoCowboys#1","Derek Smith"));
		allUsers.add(new Instructor("Name","Pass","Test User"));
		
		return allUsers;
		
	}

}
