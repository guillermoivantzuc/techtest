package com.guillermo.test.Test;

/**
 * Start: 9:50 am
 * End:   10:02 am
 * Time:  12m
 * Given a sorted array of strings which is interspersed with empty strings, 
 * write a function to find the location of a given string.
 * @author guillermoMac
 *
 */
public class Solution06 {

	public static void main(String[] args) {

		String[] array = {
				"at", "", "", "", "ball", "", "", "car", "",
				"", "dad", "", ""
		}; 
		
		// Input: find "ball" in ["at", "", "", "", "ball", "", "", "car", "","", "dad", "", ""]
		// Output: 4
		System.out.println(findInArray(array, "ball"));
	}
	
	public static int findInArray(String[] array, String word) {
		
		for(int i=0; i< array.length; i++ ) {
			if(array[i]== null || array[i].isEmpty())
				continue;
			
			if(array[i].equals(word)) {
				return i;
			}
		}
		return -1;
	}

}
