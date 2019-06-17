package com.guillermo.test.Test;

/**
 * Start: 8:20 am
 * End:   8:45 am
 * Time:  25m
 * 1. Write a function that receives a matrix and returns its transposed one.
 * 	Change rows to columns and vice-versa
 * @author guillermoMac
 *
 */
public class Solution01 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[][] {
			{34,20,32},
			{41,15,36},
			{17,48,99}
		}; 

		printMatrix(matrix);
		transpose(matrix);
	}
	
	public static void transpose(int[][] matrix) {
		
		//Create a new matrix may it's not a square matrix
		//and change the column size for row size and vice-versa
		int columns = matrix[0].length;
		int rows = matrix.length;
		int[][] transposedMatrix = new int[columns][rows];
		for(int i=0; i< matrix.length; i++) {
			for(int j=0; j< matrix[0].length; j++) {
				transposedMatrix[j][i] = matrix[i][j];
			}
		}
		
		printMatrix(transposedMatrix);
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
