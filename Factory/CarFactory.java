/*
 * CarFactory is a class to make cars based on their type make and model
 * @author Austin Cappuccio
 */

public class CarFactory {

	/*
	 * The createCar class takes the type of car that was inputted and returns the proper car varaible
	 * @param type This is the type of car that should be made
	 * @param make This is the make of the car
	 * @param model This is the model of the car
	 * @return Returns the car that has the correct type, make, and model
	 */
	public static Car createCar(String type, String make, String model) {
		if (type.equalsIgnoreCase("Small")) {
			return new SmallCar(make, model);
		} else if (type.equalsIgnoreCase("Sedan")) {
			return new SedanCar(make, model);
		} else {
			return new LuxuryCar(make, model);
		}
	}
	
}
