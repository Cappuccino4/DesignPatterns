/*
 * Subject Interface
 * @author Austin Cappuccio
 */
public interface Subject {
	public void registerObsever(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
