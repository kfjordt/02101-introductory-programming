
public class Password {

	public static void main(String[] args) {
		System.out.println(Password.checkPWD("1234AAbb"));
		System.out.println(Password.checkPWD("123Aaab"));
		System.out.println(Password.checkPWD("1234_aa_AABB"));
		System.out.println(Password.checkPWD("XCRD113a"));
		System.out.println(Password.checkPWD("heuwjkeh28364sjdjakldgjsgfjvxmvmFGHHJKLLKJUUoiutuqotqoit758976874596875789895gjfkgfjktu4thgvnkjgkljgn"));

		
	}
	public static boolean checkPWD(String password) {
		// Check if length of password is above 2 and below 2
		// Conditions: At least 8 characters
		if (password.length() < 8) {
			return false;
		} 
		
		// Initialize strings which will be used to check password
		String LC_LETTERS = "abcdefghijklmnopqrstuwvxyz";
		String UC_LETTERS = LC_LETTERS.toUpperCase();
		String NUMBERS = "0123456789";
		
		// Initialize counter variables
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int numberCount = 0;
		
		// Iterate through each character of password
		for (int i = 0; i < password.length(); i++) {
			
			// Cast the single character as a string
			String letter = String.valueOf(password.charAt(i));
			
			// If none of allowed strings contains the character, it is an illegal character
			// Condition: Only alpha-numerical characters, i.e., a,. . . ,z,A,. . . ,Z,0,. . . ,9
			if (!NUMBERS.contains(letter) && !UC_LETTERS.contains(letter) && !LC_LETTERS.contains(letter)) {
				return false;
			}
			
			// Increment the counter variables if it is present
			if (LC_LETTERS.contains(letter)) {
				lowerCaseCount++;
			} else if (UC_LETTERS.contains(letter)) {
				upperCaseCount++;
			} else if (NUMBERS.contains(letter)) {
				numberCount++;
			}
		}
		
		// Count amount of letters
		int letterCount = upperCaseCount + lowerCaseCount;
		
		// Condition: At least two letters
		// Condition: At least two numbers
		// Condition: At least one upper case letter
		// Condition: At least one lower case letter
		if (lowerCaseCount < 1 || upperCaseCount < 1 || letterCount < 2 || numberCount < 2) {
			return false;
		}
		
		return true;
	}
}
