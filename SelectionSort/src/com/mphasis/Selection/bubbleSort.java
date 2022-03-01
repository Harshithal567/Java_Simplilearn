package com.mphasis.Selection;

public class bubbleSort {

	public static void main(String[] args) {

		int[] arr = {3 , 5 , 9 , 1 ,10, 7, 4, 8, 2 , 6 }; 
		System.out.println("Elemnts after bubble sort");
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

}
