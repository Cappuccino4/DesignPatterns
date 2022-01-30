
/*
 * A class to change characters in a password to symbols
 * @author Austin Cappuccio
 */
public class Symbols extends PasswordDecorator {

	/*
	 * Constructor that calls the constructor used in PasswordDecorator
	 * @param passwordBeginning The unchanged password
	 */
	public Symbols(Password passwordBeginning) {
		super(passwordBeginning);
	}

	/*
	 * Changes characters in the original password to symbols
	 * @return Changed password with symbols
	 */
	public String getPassword() {
		String temp = passwordBeginning.getPassword();
		String ret = "";
		for (int i = 0; i < temp.length(); i++) {
			ret += getSymbol(temp.charAt(i));
		}
		return ret;
	}
	
	/*
	 * Returns a character based on its input
	 * @param input The character to be changed
	 * @return A character that is either changed or left the same based on what the inital character is
	 */
	private char getSymbol(char input) {
		if (input == 'a') {
			return '@';
		} else if (input == 'b') {
			return '8';
		} else if (input == 'e') {
			return '3';
		} else if (input == 'g') {
			return '9';
		} else if (input == 'i') {
			return '!';
		} else if (input == 'o') {
			return '0';
		} else if (input == 's') {
			return '$';
		} else if (input == 't') {
			return '7';
		} else {
			return input;
		}
	}
	
}
