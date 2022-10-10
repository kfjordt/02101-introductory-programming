
public class Exercise03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String outStr = "";
			for (int i = 0; i < 10; i++) {
				for (int j = 1; j <= 3; j++) {
					outStr = outStr + i;
				}
			}
			
		for (int k = 0; k < 3; k++) {
			System.out.println(outStr);
		}
			
	}

}
