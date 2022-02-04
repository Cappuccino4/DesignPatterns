/*
 * SedanCar is a child class of the car class
 * @author Austin Cappuccio
 */

public class SedanCar extends Car{

	/*
	 * Constructor that calls super for the parent class to handle
	 * @param make The make of the car
	 * @param model The model of the car
	 */
	public SedanCar(String make, String model) {
		super(make, model);
	}
	
	/*
	 * Adds the right frame for this type of car
	 */
	void addFrame() {
		System.out.println("Adding a three part frame");
	}
	
	/*
	 * Adds the accessories for this type of car
	 */
	void addAccessories() {
		accessories.add(Accessories.FLOOR_MATTS);
		accessories.add(Accessories.PHONE_CHARGER);
		accessories.add(Accessories.BACK_UP_CAMERA);
		accessories.add(Accessories.EXTRA_CUP_HOLDERS);
		accessories.add(Accessories.HEATED_SEATS);
	}
}
