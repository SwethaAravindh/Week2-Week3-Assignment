package collectionsprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] txt = text.split(" ");
		System.out.println(txt.length);
		Set<String> week1 = new LinkedHashSet();
		for (String java : txt) {
			week1.add(java);
		} 
		System.out.println(week1);
	}
	

}
