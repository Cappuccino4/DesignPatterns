/*
 * SmallCar is a child class of the car class
 * @author Austin Cappuccio
 */

public class SmallCar extends Car{

	/*
	 * Constructor that calls super for the parent class to handle
	 * @param make The make of the car
	 * @param model The model of the car
	 */
	public SmallCar(String make, String model) {
		super(make, model);
	}
	
	/*
	 * Adds the right frame for this type of car
	 */
	void addFrame() {
		System.out.println("Adding a small frame");
	}
	
	/*
	 * Adds the accessories for this type of car
	 */
	void addAccessories() {
		this.accessories.add(Accessories.FLOOR_MATTS);
		this.accessories.add(Accessories.PHONE_CHARGER);
	}

}
