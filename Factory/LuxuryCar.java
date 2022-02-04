/*
 * LuxuryCar is a child class of the car class
 * @author Austin Cappuccio
 */

public class LuxuryCar extends Car{

	/*
	 * Constructor that calls super for the parent class to handle
	 * @param make The make of the car
	 * @param model The model of the car
	 */
	public LuxuryCar(String make, String model) {
		super(make, model);
	}
	
	/*
	 * Adds the right frame for this type of car
	 */
	void addFrame() {
		System.out.println("Adding a beautiful frame");
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
		accessories.add(Accessories.SPORTS_SEATS);
		accessories.add(Accessories.WINDOW_TINT);
		accessories.add(Accessories.HIGH_END_SOUND);
		accessories.add(Accessories.TRUNK_ORGANIZER);
		accessories.add(Accessories.BLUE_TOOTH);
	}
}
