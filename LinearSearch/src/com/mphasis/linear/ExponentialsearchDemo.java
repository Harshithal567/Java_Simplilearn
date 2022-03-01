package com.mphasis.linear;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialsearchDemo {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 6, 9, 12, 15, 17, 19 };
		int length = arr.length;

		System.out.println("Enter key for Exponential search");

		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();

		int outcome = exponentialSearch(arr, length, key);

		if (outcome < 0) {

			System.out.println("Element not found");

		} else {

			System.out.println("Element found at index " + outcome);
		}

	}

	public static int exponentialSearch(int arr[], int length, int key) {

		if (arr[0] == key) {
			return 0;
		}
		int i = 1;
		while (i < length && arr[i] <= key) {

			i = i * 2;
			break;
		}

		return Arrays.binarySearch(arr, i / 2, Math.min(i, length), key);

	}

}
