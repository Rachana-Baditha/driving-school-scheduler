package src;

import java.time.*;

public class InCarSession {
	
	LocalDate date;
	
	DrivingSlot slot1;
	DrivingSlot slot2;
	
	Instructor instructor;
	
	Student studentone;
	Student studenttwo;
	
	InCarSession(LocalDate date,LocalTime starttime, Instructor instructor) {
		
		this.date = date;
		
		this.slot1 = new DrivingSlot(date,starttime, instructor);
		this.slot2 = new DrivingSlot(date,starttime.plusHours(1), instructor);
		
		this.instructor = instructor;
		
	}
	
	public String toString() {
		return "Date: " + this.date + "\n" + this.slot1.toString() + "\n" + this.slot2.toString() + "\nInstructed by: " + this.instructor.toString() + "\n\n";
	}

}
