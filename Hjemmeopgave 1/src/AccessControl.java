import java.util.Scanner;
public class AccessControl {

	public static void main(String[] args) {
		// Defining states of program
		boolean userCreated = false;
		boolean userLoggedIn = false;
		boolean terminateProgram = false;
		
		String globalUsername = "";
		String globalPassword = "";
		
		// Main program will always run, only to potentially be broken by the first if statement
		while (true) {
			
			// Initial termination flag
			if (terminateProgram) {
				
				// If user is logged in (i.e. voluntarily exiting program), log user off first
				if (userLoggedIn) {				
					System.out.println("*** User " + globalUsername + " is logged off");
				}
				
				// If user is not logged in, shut down straight away
				System.out.println("*** System shutting down.");
				break;
			}
			
			// If no user is created, prompt the user to create a username and password
			// Update the associated variables when user input is correct
			if (!userCreated) {
				
				globalUsername = usernamePrompt();
				globalPassword = passwordPrompt();
				
				// Update flag
				userCreated = true;
				
				System.out.println("*** User " + globalUsername + " is registered.");
			} 
			
			// If user is logged in, print menu screen
			if (userLoggedIn) {
				menuScreen();
				
				// Read user input
				Scanner scanner = new Scanner(System.in);
				String userChoice = scanner.nextLine();
				
				// If user selects option 1, update the password variable according to the usual method
				if (userChoice.equals("1")) {
					globalPassword = passwordPrompt();
					System.out.println("*** Password changed for user " + globalUsername);
				} 
				
				// If user selects option 2, update login flag
				if (userChoice.equals("2")) {
					System.out.println("*** User " + globalUsername + " is logged off");
					userLoggedIn = false;
				} 
				
				// If user selects option 3, update termination flag
				if (userChoice.equals("3")) {
					terminateProgram = true;
				} 
				
			}
			
			// If user is created, but it is not logged in, prompt user to login
			if (userCreated && !userLoggedIn) {
				
				boolean loginSucces= loginAttempt(globalUsername, globalPassword);
				
				// Depending on if the login succeeded or not, update the relevant flags
				if (loginSucces) {
					userLoggedIn = true;
					System.out.println("*** User " + globalUsername + " is Logged on.");
				} else {
					terminateProgram = true;
				}
			}

		}
		
	}
	
	public static String passwordPrompt() {
		// Initialize variables
		String outputPassword = "";
		Scanner scanner = new Scanner(System.in);
		
		// Start while loop to collect input
		boolean correctPasswordEntered = false;
		while (!correctPasswordEntered) {
			
			// Read user input password (spaces added to reflect example)
			System.out.println("Please enter a password    :");
			String initialPassword = scanner.nextLine();
			
			// If user input passes the check, prompt them to repeat the password
			if (checkPWD(initialPassword)) {
				
				// Space added to reflect example
				System.out.println("Please repeat the password :");
				String repeatedPassword = scanner.nextLine();
				
				// If the two user inputs are equal, exit while loop
				if (initialPassword.equals(repeatedPassword)) {
					correctPasswordEntered = true;
					outputPassword = initialPassword;
				}
				
			}		
			
		}
		return outputPassword;
	}
	
	public static String usernamePrompt() {
		// Initialize variables
		String outputUsername = "";
		Scanner scanner = new Scanner(System.in);
		
		// Start while loop to collect input
		boolean correctUsernameEntered = false;
		while (!correctUsernameEntered) {
			System.out.println("Please enter a non-empty username:");
			
			String username = scanner.nextLine();
			String firstChar = String.valueOf(username.charAt(0));
			
			// If first character is not a number and there are no blank spaces, exit while loop
			if (!"0123456789".contains(firstChar) && !username.contains(" ")) {
				correctUsernameEntered = true;
				outputUsername = username;
			}
		}
		
		return outputUsername;
	}
	
	public static void menuScreen() {
		// Simply a collection of strings
		System.out.println("You now have the following choices:");
		System.out.println("1 - Change Password");
		System.out.println("2 - Log off");
		System.out.println("3 - Shut down");
		System.out.println("Please select:");
		
	}

	public static boolean loginAttempt(String username, String password) {
		// Initialize scanner variable
		Scanner scanner = new Scanner(System.in);
		
		// Keep asking for username if input username does not exist
		boolean userExists = false;
		while (!userExists) {
			
			System.out.println("To logon enter username: ");
			String usernameInput = scanner.nextLine();
			
			// If user name input exists
			if (usernameInput.equals(username)) {
				userExists = true;
			}
		}
		
		// Run this for loop 3 times (because of 3 login attempts)
		for (int i = 0; i < 3; i++) {
			System.out.println("To logon enter password: ");
			String passwordInput = scanner.nextLine();
			
			// When the password input matches the correct password, return true
			if (passwordInput.equals(password)) {
				return true;
			}
		}
		
		// If above attempt failed, login was not successful
		return false;
		
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

