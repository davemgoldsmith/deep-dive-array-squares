package edu.cnm.deepdive.arrays;

import java.util.Arrays;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] squares = new int[50];
		for (int i = 1; i <= squares.length - 1; i++) {
			squares[i] = i * i;	
		}
			System.out.println(Arrays.toString(squares));
	
			
		}
		 
	}


