
public class Exercise06 {
	
	public static void main(String[] args) {
		
		int antal_trapper 		= 5;
		int mellemrum_tæller 	= 1;
		
		for (int i = antal_trapper; i > 0; i--) {
			
			// Første linje af trappe
			printMellemrum(i);
			System.out.print("  O  ******");
			printMellemrum(mellemrum_tæller);
			mellemrum_tæller = mellemrum_tæller + 1; // Efter første del af trappe-trin, skal der laves et mellemrum
			System.out.println("*");
			
			// Anden linje af trappe
			printMellemrum(i);
			System.out.print(" /|\\ *");
			printMellemrum(mellemrum_tæller);
			System.out.println("*");
			
			// Tredje linje af trappe
			printMellemrum(i);
			System.out.print(" / \\ *");
			printMellemrum(mellemrum_tæller);
			System.out.println("*");
			
		}
		
		for (int k = 0; k < antal_trapper * 5 + 7; k++) {
			System.out.print("*");
		}
		
	}
	
	public static void printMellemrum(int i) {
		for (int k = 1; k < i; k++) {
			System.out.print("     ");
		}
	}
	
}
