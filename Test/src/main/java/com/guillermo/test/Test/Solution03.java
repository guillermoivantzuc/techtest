package com.guillermo.test.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Start: 9:00 am
 * End:   9:31 am
 * Time:  31 m
 * Write a function such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to 0 and then printed out.
 * @author guillermoMac
 *
 */
public class Solution03 {

	public static void main(String[] args) {

		int[][] matrix = new int[][] {
			{34,20,0},
			{41,0,36},
			{17,48,9}
		}; 
		
		changeMatrix(matrix);
	}
	
	public static void changeMatrix(int[][] matrix) {
		
		Set<Integer> columnsToClean = new HashSet<>();
		for(int i=0; i < matrix.length; i++) {
			
			boolean cleanRowValues = false;
			for(int j=0; j< matrix[0].length; j++) {
				
				if(matrix[i][j] == 0) {
					
					//Save the row columns to clean the whole column
					columnsToClean.add(j);
					
					//Clean values that appeared values before for this row
					for(int row = j; row >= 0; row--) {
						matrix[i][row] = 0;
					}
					cleanRowValues = true;
				}
				
				//The next values in the iteration will be cleaned
				if(cleanRowValues) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//Clean columns
		columnsToClean.stream().forEach(index -> {
			for(int i=0; i< matrix[0].length; i++) {
				matrix[i][index] = 0;
			}
		});
		
		printMatrix(matrix);
	}

	static void printMatrix(int[][] matrix) {
		
		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j< matrix[0].length; j++) {
				System.out.print(String.format(" %d ", matrix[i][j]));
			}
			System.out.println();
		}
		System.out.println();
	}
}
