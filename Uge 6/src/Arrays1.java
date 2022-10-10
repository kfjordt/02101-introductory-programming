
public class Arrays1 {
	public static void main(String[] args) {
		int[] input = {74, 85, 102, 99, 101, 85, 56};
		System.out.println(lastIndexOf(input, 85));
		
	}
		
	public static int lastIndexOf (int[] a, int v) {
		int last_index = -1;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == v) {
				
				last_index = i;
				
			}
			
		}
		
		return last_index;
	}
	
}
