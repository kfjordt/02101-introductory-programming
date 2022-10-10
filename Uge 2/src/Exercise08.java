
public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		for (int i = 0; i < 2000; i++) {
			
			for (int j = 0; j <= 2000; j++) {
				
				for (int k = 0; k < 2000; k++) {
					
					a++;
				}
			}
		}
		System.out.println("Final value of a is "+a);
	}

}
