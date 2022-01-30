
/*
 *  An abstract class that builds off of the abstract Password class to be used as a decorator
 *  @author Austin Cappuccio
 */
public abstract class PasswordDecorator extends Password{
	
	protected Password passwordBeginning;
	
	/*
	 * Constructor that allows the program to use the password that was inputed
	 * @param passwordBeginning Initial password without being decorated
	 */
	public PasswordDecorator(Password passwordBeginning) {
		super();
		this.passwordBeginning = passwordBeginning;
	}
	
	/*
	 * An abstract class for each decorator to change the password
	 * @return New Password
	 */
	public abstract String getPassword();
	
}
