import java.util.Scanner;

public class Exercise04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
	   
        int prod = Factorial.factorial(start);
        System.out.print(prod);
	}
    
	
}
