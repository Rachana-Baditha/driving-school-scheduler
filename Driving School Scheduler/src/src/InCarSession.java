package src;

import java.time.*;

public class InCarSession{

	
	LocalDate date;
	Instructor instructor;
	
	LocalTime startFirst;
	Student studentFirst;
	
	LocalTime startSecond;
	Student studentSecond;
	
	InCarSession(){
		
	}
	
	InCarSession(LocalDate date, Instructor instructor, LocalTime startTime){
		this.date = date;
		this.instructor = instructor;
		this.startFirst = startTime;
		this.startSecond = startTime.plusHours(1);
	}
	
	boolean addStudent(Student student) {
		return false;
	}
		
	
}
