import java.util.Random;

/*
 * A class to change half of the characters to uppercase
 * @author Austin Cappuccio
 */

public class RandomCasing extends PasswordDecorator {

	/*
	 * Constructor that calls the constructor used in PasswordDecorator
	 * @param passwordBeginning The unchanged password
	 */
	public RandomCasing(Password passwordBeginning) {
		super(passwordBeginning);
	}

	/*
	 * Changes the original password to having half of the characters be uppercase
	 * @return The changed password
	 */
	public String getPassword() {
		String temp = passwordBeginning.getPassword();
		String ret = "";
		Random rand = new Random();
		for (int i = 0; i < temp.length(); i++) {
			if (rand.nextBoolean()) {
				ret += goUpper(temp.charAt(i));
			} else {
				ret += temp.charAt(i);
			}
		}
		return ret;
	}
	
	/*
	 * Changes a character to uppercase
	 * @param input The character to be made uppercase
	 * @return The uppercase character
	 */
	private char goUpper(char input) {
		return Character.toUpperCase(input);
	}

}
