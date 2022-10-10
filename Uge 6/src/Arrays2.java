
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays2.countInRange(new int[] { 14, 1, 22, 17, 36, 7, 43, 5 }, 4, 17));
	}
	public static int countInRange(int[] a, int min , int max) {
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] <= max && a[i] >= min) {
				
				counter++;
				
			}
			
		}
		
		return counter;
	}
}
