package com.guillermo.test.Test;

/**
 * Start: 6:15 am
 * End:   7:20 am
 * Time:  1:05 h
 * Write a function that receives n (a number) as a parameter and prints all 
 * valid (properly opened and closed) combinations of n-pairs of parentheses.
 * @author guillermoMac
 *
 */
public class Solution04 {

	static final String BRACKET_OPEN = "(";
	static final String BRACKET_CLOSE = ")";
	
	public static void main(String[] args) {
		
		int number = 3;
		printParenthesis(number);
	}
	
	static void printParenthesis(int number) {
		
		printRoundBrackets(number);
		System.out.println();
		
		if(number > 1) {
			//Print nested 
			printNestedBrackets(number);	
			System.out.println();
		}
		
		for(int i=1;i <= number; i++) {
			if((number - i) > 1) {
				printRoundBrackets(i);
				printNestedBrackets(number - i);
				System.out.println();
				
				printNestedBrackets(number - i);
				printRoundBrackets(i);
				System.out.println();
			}
		}
		
		//put all in a parenthesis
		System.out.print(BRACKET_OPEN);
		printRoundBrackets(--number);
		System.out.print(BRACKET_CLOSE);
	}
	
	
	static void printRoundBrackets(int number) {
		
		//Print single one combination
		for(int i=0; i< number; i++) {
			System.out.print(BRACKET_OPEN + BRACKET_CLOSE);
		}
	}
	
	static void printNestedBrackets(int number) {
		
		if(number == 0)
			return;
		
		System.out.print(BRACKET_OPEN);
		printNestedBrackets(--number);
		System.out.print(BRACKET_CLOSE);
	}
	

}
