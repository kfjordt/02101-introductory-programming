import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		
		if (input.contains("java")) {
			System.out.print("yes");
		} else if (input.contains("nova")) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}

}
