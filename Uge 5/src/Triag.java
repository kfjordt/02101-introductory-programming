
public class Triag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(computeIndex(1));
	}
	public static int computeIndex(int n) {
		int i = 0;
		int T = 0;
		
		while (T < n) {
				i++;
				T = T + i;
			}

		return i;
	}
}
