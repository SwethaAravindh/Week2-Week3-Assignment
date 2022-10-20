package week3.day1.classroom;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		String[] input= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		// get the length of the array	
		int len= input.length;
		// sort the array
	    List<String> list= Arrays.asList(input);
		Collections.sort(list);
		// Iterate it in the reverse order
		for(int i= list.size()-1;i>=0;i--) {
		
		// print the array
		System.out.println(list.get(i));}
	}

}
