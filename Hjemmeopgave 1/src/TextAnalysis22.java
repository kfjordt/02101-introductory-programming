import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class TextAnalysis22 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter filepath: ");
		
		Scanner scanner = new Scanner(System.in);			
		String filePath = scanner.nextLine();
		
		TextAnalysis22 firstText = new TextAnalysis22(filePath, 20);
		
	}
	
	
	private List<String> cleanedString;
	
	public TextAnalysis22(String sourceFileName, int maxNoOfWords ) throws IOException {
		String fileContents = loadTextFile(sourceFileName);
		cleanedString = cleanString(fileContents);
		
	}
	
	public int countWords() {
		return cleanedString.size();
	}
	
	public int frequency(String word) {
		int counter = 0;
		
		for (int i = 0; i < cleanedString.size(); i++) {
			
			if (cleanedString.get(i).equals(word)) {
				
				counter++;
				
			}
			
		}
		return counter;
	}
	
	public boolean contains(String word1, String word2) {
		
		for (int i = 0; i < cleanedString.size() - 1; i++) {
			boolean firstTest = cleanedString.get(i).toLowerCase().equals(word1.toLowerCase());
			boolean secondTest = cleanedString.get(i + 1).toLowerCase().equals(word2.toLowerCase());
			
			if (firstTest && secondTest) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public String loadTextFile(String filePath) throws IOException {
		Path fileName = Path.of(filePath);
		return Files.readString(fileName);
	}
	
	public List<String> cleanString(String fileContent) {
		String LETTERS_AND_SPACE = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String linebreaksRemoved = fileContent.replace("\n", " ").replace("\r", "");
		
		List<String> outputList = new ArrayList<String>();
		
		int index = 0;
		for (int i = 0; i < linebreaksRemoved.length(); i++) {
			
			// Cast the single character as a string
			String letter = String.valueOf(linebreaksRemoved.charAt(i));
			
			if (!LETTERS_AND_SPACE.contains(letter)) {
				
				String currentWord = linebreaksRemoved.substring(index, i);
				outputList.add(currentWord);
				
				index = i;
			}
			
		}
		
		outputList.add(linebreaksRemoved.substring(index, linebreaksRemoved.length()));
		
		return outputList; 
		
	}
}


