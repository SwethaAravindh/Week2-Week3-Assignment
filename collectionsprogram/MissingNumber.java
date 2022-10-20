package collectionsprogram;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class MissingNumber {
	public static void main(String[] args) {
		int[] number = { 2, 6, 9, 5, 1, 7, 9, 2, 8, 3 };
		int count = 1;
		List<Integer> lst = new ArrayList();
		for (Integer n : number) {
			lst.add(n);
		}
		Collections.sort(lst);
		Set<Integer> num = new TreeSet<Integer>(lst);
		System.out.println(num);
		for (Integer m : num) {

			if (count != m) {
				System.out.println("MissingNumber is " + count);
				break;
			} else {
				count = count + 1;
			}

		}
	}
}