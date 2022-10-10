import java.util.Scanner;

public class Exercise03 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int tal = console.nextInt();
		
		printNumbers(tal);
	}
	
	public static String printNumbers(int tal) {
		String outStr = "";
		
		for (int i = 1; i <= tal; i++) {
			System.out.print(outStr + "[" + i + "]");
		}
			
		return outStr;
	}

}
