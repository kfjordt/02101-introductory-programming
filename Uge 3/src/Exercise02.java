import java.util.Scanner;

public class Exercise02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Input start value");
        int start = scanner.nextInt();
	    System.out.println("Input end value");
        int end = scanner.nextInt();
        int sum = computeSum(start,end);
        System.out.println("Sum is of integers from "+start+" to "+
        end+" is "+sum);
        scanner.close();
	}
    
	public static int computeSum(int num1, int num2) {
		int sum = 0;
		
		for (int i = num1; i <= num2;  i++) {
			sum = sum + i;
		}
		return sum;
	}
    // Implement method  computeSum  here.
}
