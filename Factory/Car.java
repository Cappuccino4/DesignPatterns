import java.util.ArrayList;

/*
 * The car class is the parent method for all of the different types of cars
 * @author Austin Cappuccio
 */

public abstract class Car {

	/*
	 * Below are the variables that make up each car
	 * Included is the array list to hold all of the accessories
	 */
	private String make;
	private String model;
	ArrayList<Accessories> accessories;
	
	/*
	 * The car constructor saves the make and model, initiates the array list, and calls to assemble the car
	 * @param make The make of the car
	 * @param model The model of the car
	 */
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		accessories = new ArrayList<Accessories>();
		assemble();
	}
	
	/*
	 * The assemble class prints out the car that is being made and then adds all of the componets for the car
	 */
	public void assemble() {
		System.out.println("Creating a " + make + " " + model);
		addFrame();
		addWheels();
		addEngine();
		addWindows();
		addAccessories();
		displayAccessories();
	}
	
	/*
	 * An abstract class to add a frame on the car, it changes between types
	 */
	abstract void addFrame();
	
	/*
	 * Adds the wheels to the car
	 */
	private void addWheels() {
		System.out.println("Adding the Wheels");
	}
	
	/*
	 * Adds the Engine to the car
	 */
	private void addEngine() {
		System.out.println("Adding a Standard Engine");
	}
	
	/*
	 * Adds the Windows to the car
	 */
	private void addWindows() {
		System.out.println("Adding Windows");
	}
	
	/*
	 * An abstract class to add a accessories on the car, it changes between types
	 */
	abstract void addAccessories();
	
	/*
	 * A class that loops through the accessories array list and prints them out in order
	 */
	private void displayAccessories() {
		System.out.println("Accessories: \n");
		for(int i = 0; i < accessories.size(); i++) {
			System.out.println("- " + accessories.get(i));
		}
	}
	
}
