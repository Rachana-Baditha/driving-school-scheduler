package src;

import java.time.*;
import java.util.*;

public class Student extends User{
	
	String studentCategory;
	
	public String toString() {
		return("Student\nName: " + this.getName() + "\nType: " + this.studentCategory + "\n\n");
	}

	@Override
	boolean getSystemOptions(Scanner keyboard, Database database) {
		// TODO Auto-generated method stub
		return false;
	}

	
		
	

}
