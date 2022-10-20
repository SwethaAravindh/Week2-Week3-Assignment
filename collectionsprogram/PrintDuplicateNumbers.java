package collectionsprogram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] number = { 2, 6, 9, 5, 1, 7, 9, 2, 8, 3 };
		Arrays.sort(number);
		Set<Integer> n = new TreeSet<Integer>();
		for (int i = 0; i < number.length; i++) {
			for (int num : n) {
				if (number[i] == num) {
					System.out.println("Duplicate Value:" + number[i]);
					break;
				}
			}
			n.add(number[i]);

		}
	}
}
