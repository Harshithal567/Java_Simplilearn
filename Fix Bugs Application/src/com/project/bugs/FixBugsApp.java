package com.project.bugs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixBugsApp {

	public static void main(String[] args) {
		
		
		System.out.println("\b-------------------------------------\n");
		System.out.println("\b*****Welcome to portal**** \n");
		System.out.println("\b----------------------------------------\n");
		optionsSelection();

	}

	private static void optionsSelection() 
	{
		String[] arr = { 
				"1. I wish to review my expenditure",
				"2. I wish to add my expenditure",
				"3. I wish to delete my expenditure", 
				"5. I wish to search for a particular expenditure", 
				"6. Close the application"
				};
		
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++)
		{
			System.out.println(arr[i]);
		
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> Monthlyexpenses = new ArrayList<Integer>();
	    Monthlyexpenses.add(10);
	    Monthlyexpenses.add(20);
		Monthlyexpenses.add(30);
		Monthlyexpenses.add(40);
		Monthlyexpenses.add(50);
	    Monthlyexpenses.addAll(arrlist);
		System.out.println("\nEnter the option:\t");
		Scanner sc = new Scanner(System.in);
		int options;
		do {
			options = sc.nextInt();
			switch (options) {
			case 1:
				System.out.println("List of your expenses : \n");
				System.out.println(Monthlyexpenses + "\n");

				break;
			case 2:
				System.out.println("Enter the value : \n");
				int value = sc.nextInt();
				Monthlyexpenses.add(value);
				System.out.println("Updated\n");
				Monthlyexpenses.addAll(arrlist);
				System.out.println(Monthlyexpenses + "\n");

				break;
			case 3:
				System.out.println(
						"Sure? Confirm again by clicking the same option\n");
				int con_choice = sc.nextInt();
				if (con_choice == options) {
					Monthlyexpenses.clear();
					System.out.println(Monthlyexpenses + "\n");
					System.out.println("Deleted!\n");
				} else {
					System.out.println("Try again!");
				}

				break;

			case 4:
				searchExpenses(Monthlyexpenses);

				break;
			case 5:
				closeApp();
				break;
			default:
				System.out.println("Wrong option!");
				break;
			}
		} while (options != 6);
	

	}

	private static void closeApp() {
		System.out.println("Closing your application... \n"
				+ "Thank you! Visit Again");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
//		int leng = arrayList.size();
		Scanner searchScanner = new Scanner(System.in);
		
		System.out.println("Enter the bikeexpense you need to search:\t");
		int searchNum = searchScanner.nextInt();
		System.out.println(arrayList.contains(searchNum) ? "Found your bikeexpense: " + searchNum
				: "Sorry , Please try again.");
		
	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
//		int arrlength = arrayList.size();
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		}

}
