
public class Easter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Easter.computeEaster(2022));
		System.out.println(Easter.computeEaster(2013));
		System.out.println(Easter.computeEaster(367));
		System.out.println(Easter.computeEaster(33));
		System.out.println(Easter.computeEaster(5));
		System.out.println(Easter.computeEaster(7309));
	}
	public static String computeEaster(int year) {
		// Do initial calculations to find days until Easter Sunday
		int a = year % 4;
		int b = year % 7;
		int c = year % 19;
		int d = (19 * c + 24) % 30;
		int e = (2 * a + 4 * b + 6 * d + 5) % 7;
		int f = (c + 11 * d + 22 * e) / 451;
		
		// Calculate the amount of days for the other holidays
		int daysToEasterSunday = 22 + d + e - 7 * f;
		int daysToGoodFriday = daysToEasterSunday - 2;
		int daysToEasterMonday = daysToEasterSunday + 1;
		
		// Format the integers to correspond to a date in mm.dd format
		String easterSundayFormatted = formatEasterDates(daysToEasterSunday);
		String goodFridayFormatted = formatEasterDates(daysToGoodFriday);
		String easterMondayFormatted = formatEasterDates(daysToEasterMonday);
		
		// Concatenate string to conform to required format
		String yearString = Integer.toString(year);
		
		// Add zeros in front of year
		String zeros = "";
		for (int i = 0; i < 4 - yearString.length(); i++) {
			zeros += "0";
		}
		String formattedYear = zeros + yearString;
		
		String outputString = formattedYear + " " + goodFridayFormatted + " " + easterSundayFormatted + " " + easterMondayFormatted; 
		
		return outputString;		
	}
	
	public static String formatEasterDates(int daysFromMarch1) {
		// Initialize variables
		String monthString = "";
		String dayString = "";
		
		// If the amount of days until Easter Sunday is above 30, that means 
		// the month is April, and the days is the remainder of the amount of days
		// in March (i.e. 31)
		if (daysFromMarch1 > 31) {
			
			monthString = "04";
			dayString = Integer.toString(daysFromMarch1 % 31);
			
		} 
		// If the amount of days until Easter Sunday is below 30, that means 
		// the month is March, and the days is simply the integer itself
		else {
			
			monthString = "03";
			dayString = Integer.toString(daysFromMarch1);
		}
		
		// If the date falls between the 1st and the 9th, prepend a 0 to the date
		if (dayString.length() == 1) {
			dayString = "0" + dayString;
		}

		return dayString + "." + monthString;
	}
}	
