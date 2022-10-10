public class Exercise05 {
	
	public static void main(String[] args) {
		
		int num = 1;
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j > (i - 1); j--) {
				System.out.print("-");
			}
			
			for (int j = 9; j >= (11 - 2 * i); j--) {
				System.out.print(num);
			}
			
			for (int j = 5; j > (i - 1); j--) {
				System.out.print("-");
			}
			
			num = num + 2;
			System.out.println();
		}
		
	
	}
	
}