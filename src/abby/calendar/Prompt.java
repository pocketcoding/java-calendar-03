package abby.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal > ";
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1; // we need to initialize the month to compare in the while loop
		
		while (true) {
		
			System.out.print(PROMPT);
			month = scanner.nextInt();	
			
			if(month == -1) { break; }
			if(month > 12) { continue; }
			
			cal.printCalendar(2020, month);

		}

		System.out.println("Bye~");
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		// Shell execute
		Prompt p = new Prompt();
		p.runPrompt();
		
	}

}
