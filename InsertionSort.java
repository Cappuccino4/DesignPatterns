import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortBehavior{

	// Modified code from https://stackoverflow.com/questions/17432738/insertion-sort-using-string-compareto
	// Uses ArrayList instead of them using regular list
	
	public ArrayList<String> sort(ArrayList<String> data) {
		
		int i,j;
		  String key;
		  for (j = 1; j < data.size(); j++) {
		key = data.get(j);
		i = j - 1;
		while (i >= 0) {
		  if (key.compareTo(data.get(i)) > 0) {
		        break;
		      }
		      data.set(i+1, data.get(i));
		      i--;
		    }
		    data.set(i+1, key);
		  }
		
		  return data;
		  
	}

}
