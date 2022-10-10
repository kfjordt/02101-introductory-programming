import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mode(new int[] {27, 15, 15, 11, 27});
	}
	
	public static int mode(int[] a) {
		int[] countArray = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			countArray[i]++;
		}
		
		System.out.print(Arrays.toString(countArray));
		return 1;
	}
}
