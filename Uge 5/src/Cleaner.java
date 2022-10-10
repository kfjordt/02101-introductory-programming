import java.io.*;
import java.util.Scanner;

public class Cleaner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		cleanText("C:\\Users\\kfjor\\Google Drev\\DTU\\7. semester\\02101 Introductory Programming\\Uge 5\\src\\limerick.txt");
	}
	public static void cleanText(String filename) throws FileNotFoundException { {
		File file = new File(filename);
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String text = input.nextLine();
			System.out.print(text);
			
		}
	}
}
}
