import java.util.Random;

/*
 * A class to add symbols to a password
 * @author Austin Cappuccio
 */

public class SpecialChars extends PasswordDecorator {

	/*
	 * Constructor that calls the constructor used in PasswordDecorator
	 * @param passwordBeginning The unchanged password
	 */
	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
	}

	/*
	 * Changes a password to have random symbols placed in 30% of the time
	 * @return The final password
	 */
	public String getPassword() {
		String temp = passwordBeginning.getPassword();
		String ret = "";
		Random rand = new Random();
		for (int i = 0; i < temp.length(); i++) {
			ret += temp.charAt(i);
			int num = rand.nextInt(10);
			if (num == 0 || num == 1 || num == 2) {
				ret += randomChar();
			}
		}
		return ret;
	}
	
	/*
	 * Returns a random character
	 * @return A random character
	 */
	private char randomChar() {
		Random rand = new Random();
		int num = rand.nextInt(7);
		if (num == 0) {
			return '*';
		} else if (num == 1) {
			return '!';
		} else if (num == 1) {
			return '%';
		} else if (num == 1) {
			return '+';
		} else if (num == 1) {
			return '.';
		} else if (num == 1) {
			return '{';
		} else {
			return '}';
		}
	}
}
