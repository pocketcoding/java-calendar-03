package abby.calendar;

public class Calendar {
	
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxdaysOfMonth(int month) {

		return MAX_DAYS[month - 1];

	}
	
	public void printCalendar(int month) {
		
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------------");
		System.out.println(" 1   2   3   4   5   6   7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");
	}

}