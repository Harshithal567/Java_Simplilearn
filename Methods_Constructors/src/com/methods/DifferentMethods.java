package com.methods;

import java.util.Scanner;

public class DifferentMethods {

	public static void main(String[] args) {
   

		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter product price"); 
		
		double price = scanner.nextDouble();
		
		DifferentMethods diff = new DifferentMethods(); 
		
	System.out.println(diff);	
		
		double discount =  diff.findDiscount(price);
		
		System.out.println( "Your discount amount is Rs." +discount);
		
	}

	
	
	public double findDiscount(double price) {
		
		
		
		return  (price*10) / 100;
	}



	@Override
	public String toString() {
		return "This class overrides toString() ";
	} 
	
	
	
	
	
	
}
