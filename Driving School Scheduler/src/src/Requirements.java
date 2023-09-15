package src;

import java.time.*;

public class Requirements {
	
	/* 
	 * Requirements:
	 * 		
	 * 		Session:
	 * 			Two hour time slot
	 * 			One instructor
	 * 			One or two students
	 *			Can have one or two student drivers, but maximum one adult driver
	 * 
	 * 		Student:
	 * 			Can be an adult or student driver
	 * 			Adult drivers only need 1 hour driving per session
	 * 			Student drivers need 1 hour driving and 1 hour observation
	 * 			Max 7 sessions per student
	 * 			
	 * 		Instructor:
	 * 			Takes lessons
	 * 
	 * */
	
	public static void main(String args[]) {
		
		InCarSession testSession = new InCarSession(LocalDate.now(), LocalTime.of(1, 00), new Instructor("Frank"));
		
		System.out.print(testSession.toString());
		
		
	}

}
