package src;

import java.util.*;

public abstract class User {
	
	protected String name;
	protected String username;
	protected String password;
	protected String permissions;  // To Past Rachana: What is permissions???
	
	abstract boolean getSystemOptions(Scanner keyboard, Database database);


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getUsername() {
		return username;
	}


	protected void setUsername(String username) {
		this.username = username;
	}


	protected String getPassword() {
		return password;
	}


	protected void setPassword(String password) {
		this.password = password;
	}


	protected String getPermissions() {
		return permissions;
	}


	protected void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	
	
	
	

}
