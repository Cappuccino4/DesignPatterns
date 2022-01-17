import java.util.ArrayList;

public class Listing {

	private String title;
	private ArrayList<String> items = new ArrayList<String>();
	private SortBehavior sortBehavior;
	
	public Listing(String title) {
		this.title = title;
		this.sortBehavior = new BubbleSort();
	}
	
	public void add(String item) {
		this.items.add(item);
	}
	
	public void remove(String item) {
		this.items.remove(item);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setSortBehavior(SortBehavior sortBehavior) {
		this.sortBehavior = sortBehavior;
	}
	
	public ArrayList<String> getSortedList() {
		return sortBehavior.sort(this.items);
	}
	
	public ArrayList<String> getUnSortedList() {
		return this.items;
	}
	
}
