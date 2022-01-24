import java.util.HashMap;

/*
 * TallyDisplay Displays the number of votes and the candidate
 * @author Austin Cappuccio
 */

public class TallyDisplay implements Observer {

	private Subject poll;
	private HashMap<String, Integer> votes;
	
	/*
	 * Constructor to create a new TallyDisplay Object
	 * @param poll The subject that will be used to tally votes
	 */
	public TallyDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObsever(this);
		votes = new HashMap<String, Integer>();
	}
	
	/*
	 * Updates the votes hashmap with a new one
	 * @param votes The new hashmap to be used to tally votes
	 */
	public void update(HashMap<String, Integer> votes) {
		this.votes = votes;
		display();
	}

	/*
	 * Displays the current number of votes and the candidates name
	 */
	public void display() {
		System.out.println("\nCurrent Tallies:");
		votes.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		});
	}

}
