package src;

import java.time.*;

public class DrivingSlot {
	
	LocalDate date;
	
	LocalTime starttime;
	LocalTime endtime;
	
	Instructor instructor;
	
	Student driver; 
	Student observer;  
	
	DrivingSlot(LocalDate date,LocalTime starttime, Instructor instructor){
		
		this.date = date;
		this.starttime = starttime;
		this.endtime = starttime.plusHours(1);
		
		this.instructor = instructor;
	}
	
	public String toString() {
		return( "Driving Slot from " + this.starttime + " to " + this.endtime );
	}
	
	

}
