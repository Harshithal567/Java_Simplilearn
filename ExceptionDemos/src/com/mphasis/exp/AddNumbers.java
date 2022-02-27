package com.mphasis.exp;

public class AddNumbers {

	public static void main(String[] args) {

		int sum = 0;

		try {
			for (int i = 0; i < args.length; i++) {
				sum = sum + Integer.parseInt(args[i]);
			}
		} catch (NumberFormatException e) {

			System.out.println(" not a number");
		} finally {
			// code which mandatory to execute irrespective of exp

			System.out.println("finally block executed... ");
		}
		System.out.println(sum);
	}

}
