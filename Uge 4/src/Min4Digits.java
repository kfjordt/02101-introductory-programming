
public class Min4Digits {
	public static void main(String[] args) {
		System.out.print(min4Digits(-87833));
	}
	
	public static String min4Digits(int n) {
		String outStr = "";
		int nPositive = 0;
		
		// Get absolute value of input
		if (n < 0) {
			nPositive = -n;
		} else {
			nPositive = n;
		}
		
		// Convert absolute value of input to string
		String intToStr = String.valueOf(nPositive);
		int intLength = intToStr.length();
		
		// Add minus to start of string
		if (n < 0) {
			outStr += "-";
		}
		
		// Add leading zeros
		if (intLength == 1) {
			outStr += "000" + intToStr;
		} else if (intLength == 2) {
			outStr += "00" + intToStr;
		} else if (intLength == 3) {
			outStr += "0" + intToStr;
		} else if (intLength >= 4) {
			outStr += intToStr;
		} 
		
		return outStr;
	}
	
	 public static String suggestedSolution(int n) { 
		 
		 String result = ""; 
		 
		 if(n < 0) { 
			 result += "-"; 
			 n *= -1; 
		 } 
		 
		 if (n < 10) { 
			 result += "000"; 
		 } else if (n < 100) { 
			 result += "00"; 
		 } else if (n < 1000) { 
			 result += "0"; 
		 } 
		 
		 result += n; 
		 
		 return result; 	  
	 }
}
