package week3.day1.classroom;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	private static final int i = 0;

	public static void main(String[] args) {
		//Declare a String as PayPal India
		String input= "PayPal India";
		//Convert it into a character array
		char[] charray= input.toCharArray();
		//Declare a Set as charSet for Character
		Set<Character> charSet= new HashSet<Character>();
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet= new HashSet<Character>();
		//Iterate character array and add it into charSet
		for (int i=0; i<charray.length; i++) {
		if (charSet.contains(charray[i])) {
			dupCharSet.add(charray[i]);
		}
		else {
			charSet.remove(' ');
			
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);

	}

}
}
