
public class Exercise01 {

	public static void main(String[] args) {
		
		int k = 0;
		int j = 1;
		
		for (int i = 0; i < 6; i++) {
			
			System.out.println(k + j);
			k = k + j;
			j = j + 2;
		}
	}

}
