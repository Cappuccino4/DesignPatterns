import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements SortBehavior{

	public ArrayList<String> sort(ArrayList<String> data) {
		
		 for(int i = 1; i < data.size(); i++) {
			 if (data.get(i).compareTo(data.get(i-1)) < 0) {
				 Collections.swap(data, i, i-1);
				 i = 1;
			 }
		 }
		 return data;
		
	}

}
