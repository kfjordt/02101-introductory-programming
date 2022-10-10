
public class Exercise04 {
	
	public static void main(String[] args) {	
		
		int num1 = 1;
		int num2 = 1;
		int num3;

		for (int i = 1; i <= 12; i++) {
			
			if (i <= 2) {
				System.out.print(1 + " ");
			}
			
			else {
				num3 = num1 + num2;
				
				System.out.print(num3 + " ");
				
				num1 = num2;
				num2 = num3;
			}
			
		
		}
		
	}
	
}
