import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isNumber = true;
		
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		
		try {
			Integer.parseInt(input);
			isNumber = true;
		} catch (NumberFormatException e) { 
			isNumber = false;
		}
		
		try {
			Double.parseDouble(input);
			isNumber = true;
		} catch (NumberFormatException e) { 
			isNumber = false;
		}
		
		if (isNumber) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}

		
	}

}
