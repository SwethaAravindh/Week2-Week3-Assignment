package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> largestNumber = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			largestNumber.add(data[i]);
		}
		System.out.println(largestNumber);
		List<Integer> lst = new ArrayList<Integer>(largestNumber);
		System.out.println("Second Largest Number:"+lst.get(lst.size() - 2));
	}

}
