
public class Factorial {
	public static int factorial(int n) {
		int product = 1;
		
		for (int i = 1; i <= n; i++) {
			
			
			product = i * product;
		}
		
		return product;
}
}
