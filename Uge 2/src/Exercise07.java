public class Exercise07 {
	
	public static void main( String [] args) {
		
		System.out.print("10 0"); // start without terminal blank
		runUpDownLoop(); // call the loop method
		
	}
	public static void runUpDownLoop () {
		
		for (int i = 9; i >= 5; i--) {
			
			System.out.print(" " + i + " " + (10 - i));
		}
	}
}