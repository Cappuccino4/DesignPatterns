import java.util.ArrayList;
import java.util.HashMap;
/*
 * A Student Government Poll Subject
 * @author Austin Cappuccio
 */
public class StudentGovPoll implements Subject {
	private ArrayList<Observer> observers;
	private HashMap<String, Integer> votes;
	private String school;
	private int numUpdates;
	
	/*
	 * Creates a new Poll with the indicated school name
	 * @param school The name of the school where the poll is taking place
	 */
	public StudentGovPoll(String school) {
		this.school = school;
		observers = new ArrayList<Observer>();
		votes = new HashMap<String, Integer>();
		numUpdates = 0;
	}
	
	/*
	 * Registers the observer provided in the observer ArrayList
	 * @param observer The observer object in which you want to be added
	 */
	public void registerObsever(Observer observer) {
		observers.add(observer);
	}

	/*
	 * Removes the observer provided in the observer ArrayList
	 * @param observer The observer object in which you want to be deleted
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/*
	 * Updates all observers
	 */
	public void notifyObservers() {
		if (numUpdates % 4 == 0) {
			for (Observer observer : observers) {
				observer.update(votes);
			}
		}
	}
	
	/*
	 * Adds a candidate to our HashMap
	 * @param president Name of the new candidate
	 */
	public void addCandidate(String president) {
		votes.put(president, 0);
	}
	
	/*
	 * Adds votes to the candidate passed in
	 * @param president Name of the candidate that is getting votes
	 * @param num How many votes they are getting
	 */
	public void enterVotes(String president, int num) {
		int currentVotes = votes.get(president);
		votes.replace(president, currentVotes + num);
		numUpdates++;
		notifyObservers();
	}
	
	/*
	 * Returns the name of the school
	 * @return School name
	 */
	public String getSchool() {
		return this.school;
	}

}
