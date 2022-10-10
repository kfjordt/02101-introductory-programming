
public class Power {
	public static double power(double num, int exponent) {
		
		double product = 1;
		
		for (int i = 1; i <= exponent; i++) {
			
			product = product * num;
		}
		
		return product;
	}
}
