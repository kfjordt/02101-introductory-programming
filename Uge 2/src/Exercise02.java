
public class Exercise02 {

	public static void main(String[] args) {
		
		int k = 0;
		int j = 1;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(k + j);
			k = k + j;
			j = j + 2;
		}
	}

}
