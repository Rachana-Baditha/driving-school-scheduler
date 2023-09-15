package src;

public class Adult extends Student {
	
	Adult(String name){
		super(name, "Adult");
	}
	
	public static void main(String args[]) {
		Adult Rachana = new Adult("Rachana");
		
		System.out.print(Rachana.toString());
	}

}
