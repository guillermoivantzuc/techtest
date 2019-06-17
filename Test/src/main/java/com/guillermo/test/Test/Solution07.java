package com.guillermo.test.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * Start: 10:05 am
 * End:   12:04 am
 * Time:  2h +
 * 7. Write a function to print all permutations of a string. 
 *    Max string length can be 50 characters.
 * @author guillermoMac
 *
 */
public class Solution07 {

	public static void main(String[] args) {

		String value = "abcd";
		permuteString(value);
	}
	
	public static void permuteString (String value) {
		
		//Use set to avoid repeated values
		Set<String> permutation = new TreeSet<>();
		//permutation.add(value);
		//Get the factorial to know the number of permutations
		int factorial = factorial(value.length());
		performPermutation(permutation, factorial, value);
		//Print permutations
		System.out.println("Permutation number: " + permutation.size());
		permutation.stream().forEach( n-> {
			System.out.print(String.format("%s ", n));
		});
	}
	
	static void performPermutation(Set<String> permutations, int factorial, String value) {
		
		permutations.add(value);
		char[] stringArray = value.toCharArray();
		for(int i = 0; i< stringArray.length - 1 ; i++) {
			//Move the first element to the next index to generate a new order
			char tmp  = stringArray[i];
			stringArray[i] = stringArray[i + 1];
			stringArray[i+1] = tmp;
			String permutation = String.copyValueOf(stringArray);
			if(!permutations.contains(permutation)) {
				performPermutation(permutations, factorial, permutation);
			}
		}
	}
	
	
	/**
	 * Example 5 * 4 * 3* 2 * 1
	 * @param n
	 * @return
	 */
	static int factorial(int n) {

		if(n==0) {
			//this is the last iteration, so return 1
			return 1;
		}

		return n * factorial(--n);
	}

}
