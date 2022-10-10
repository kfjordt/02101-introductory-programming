
public class Cosine {
	
	public static void main(String[] args) {
		
		System.out.print(Cosine.cosine(0.5, 1));
		
	}
	public static double cosine(double x, int k) {
		
		double sum = 0;
		
		for (int i = 0; i <= k; i++) {
			sum = sum + (power((-1), i) * power(x, 2*i)  / factorial((2*i)));
		}
		
		return sum;
	}
	
	public static double power(double num, int exponent) {
		
		double product = 1;
		
		for (int i = 1; i <= exponent; i++) {
			
			product = product * num;
		}
		
		return product;
	}
	
	public static int factorial(int n) {
		
		int product = 1;
		
		for (int i = 1; i <= n; i++) {
			
			
			product = i * product;
		}
		
		return product;
}
	
}
