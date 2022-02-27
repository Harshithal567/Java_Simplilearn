package com.mphasis.arrays;

public class MultipleArrays {

	public static void main(String[] args) {
		
		
		int[][] arr = {{2,4},{12,14},{22,24}};
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1][1]);
		

		int[][] arr2 = new int[3][];
		
		arr2[0] = new int[2];
		
		arr2[1] = new int[3];
		
		arr2[2] = new int [4];
	}

}
