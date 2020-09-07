import java.util.ArrayList;
import java.util.List;

public class BSearch {
	
	public static List<Integer> data = new ArrayList<Integer>();
	//¶þ·Ö·¨
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
		data.add(44);
		data.add(55);
		data.add(66);
		data.add(77);
		
		int index = bSearch(33);
		
		System.out.println("the search value is in: " + index);
	}

}
