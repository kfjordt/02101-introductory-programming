
public class Exercise05 {

	public static void main(String[] args) {

		long milliseconds = System.currentTimeMillis();
		
		long seconds = milliseconds / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		long months = days / 30;
		long years = days / 365;

		String outStr = "Years: " + years + ", months: " + months + ", days: " + days + ", hours: " + hours + ", minutes: " + minutes + ", seconds: " + seconds;
		
		System.out.print(outStr);
	}
	

}
