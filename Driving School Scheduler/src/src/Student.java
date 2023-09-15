package src;

import java.time.*;
import java.util.*;

public class Student {
	
	String name;
	String studentType; // Try to remove this later
	
	int completedLessons;
	int totalLessons;
	
	
	Student(String name, String sType){
		this.name = name;
		
		this.totalLessons = 7;
		this.completedLessons = 0;
		
		this.studentType = sType;  
	}
	
	public String toString() {
		return("Student\nName: " + this.name + "\nType: " + this.studentType + "\n\n");
	}
	
	public static void main(String args[]) {
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Adult("Rachana"));
		studentList.add(new Teen("Sarah"));
		
		for(Student student: studentList) {
			System.out.print(student.toString());
		}
		
	}

}
