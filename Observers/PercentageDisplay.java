import java.text.DecimalFormat;
import java.util.HashMap;

/*
 * PercentageDisplay Displays the percentage of votes the candidate got and the candidate
 * @author Austin Cappuccio
 */

public class PercentageDisplay implements Observer {
	
	private Subject poll;
	private HashMap<String, Integer> votes;
	private int numVotes;
	
	/*
	 * Constructor to create a new PercentageDisplay Object
	 * @param poll The subject that will be used to tally votes
	 */
	public PercentageDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObsever(this);
		votes = new HashMap<String, Integer>();
		numVotes = 0;
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
	 * Displays the current candidates and the percentage of votes they have
	 */
	public void display() {
		DecimalFormat df = new DecimalFormat("##.#");
		System.out.println("\nCurrent Percent of Votes:");
		votes.entrySet().forEach(entry -> {
			numVotes += entry.getValue();
		});
		votes.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + ": " + df.format((0.0 + entry.getValue())/numVotes * 100) + "%");
		});
	}

}
