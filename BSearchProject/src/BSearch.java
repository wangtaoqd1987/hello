import java.util.ArrayList;
import java.util.List;

public class BSearch {
	
	public static List<Integer> data = 
			new ArrayList<Integer>();
	
	public static int bSearch(int searchValue) {
		int low = 0;
		
		int high = data.size() - 1;
		
		Integer[] a = data.toArray(new Integer[0]);
		
		while(low <= high) {
			
			int mid = (high + low) / 2;
			
			if(a[mid] == searchValue) {
				return mid;
			}else if(a[mid] < searchValue) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);
		data.add(6);
		data.add(9);
		
		int index = bSearch(9);
		
		System.out.println("the search value is in: " + index);
		
	}
	

}
