import java.util.Random;

/*
 * Easy Password is a class that takes a password as a string and changes it to be better
 * @author Austin Cappuccio
 */

public class EasyPassword extends Password{
	
	/*
	 * A constructor for the easy passwords
	 * @param phrase A string that is not changed to be a better password
	 */
	public EasyPassword(String phrase) {
		password = phrase;
	}
	
	/*
	 * A method to change the password to get rid of white space and add a number 0-100 on the end
	 * @return Final modified password
	 */
	public String getPassword() {
		String temp = noSpace(password);
		String ret = addNumber(temp);
		return ret;
	}
	
	/*
	 * Returns a string without whitespace
	 * @param input The String that needs whitespace removed
	 * @return String without whitespace
	 */
	private String noSpace(String input) {
		String ret = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				ret += input.charAt(i);
			}
		}
		return ret;
	}
	
	/*
	 * Returns a string with a number on the end of it 0-100
	 * @param input The String that needs whitespace removed
	 * @return String with a number on the end
	 */
	private String addNumber(String input) {
		Random rand = new Random();
		return input + rand.nextInt(101);
	}
}
