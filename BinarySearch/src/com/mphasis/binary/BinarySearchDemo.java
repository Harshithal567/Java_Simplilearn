package com.mphasis.binary;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10, 12 };

		int length = arr.length;

		int start = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter key for Binary search");
		int key = scanner.nextInt();

		binarySearch(arr, start, key, length);

	}

	public static void binarySearch(int[] arr, int start, int key, int length) {

		int midValue = (start + length) / 2;
		while (start <= length) {

			if (arr[midValue] < key) {

				start = midValue + 1;
			} else if (arr[midValue] == key) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {

				length = midValue - 1;
			}
			midValue = (start + length) / 2;
		}
		if (start > length) {

			System.out.println("Element is not found");
		}

	}

}
