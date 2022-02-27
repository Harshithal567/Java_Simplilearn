package com.mphasis.arrays;


public class ArraysDemo {

	public static void main(String[] args) {
		
		         // 0    1   2   3   4
		//syn1
		int ar1[]= {101,102,103,104,105}; 
		//int []ar1
		//int[] ar1
		
		int[] a1,a2;
		
		
		
		int arr[], x;
		
		System.out.println(ar1.length);
		
		System.out.println(ar1);
	  System.out.println(ar1[0]); 
		
		for(int i = 0; i < ar1.length; i++) { 
			
			System.out.println(ar1[i]);
		}
		
		
		int ar2[] = new int[4];
		
		System.out.println(ar2.length);
		
		System.out.println(ar2);
		
		ar2[0]= 701;
		ar2[1] = 702;
		ar2[2] =703; 
		
		for (int i = 0; i < ar2.length; i++) {
			
			System.out.println(ar2[i]);
		}
	 
	for (int element : ar2) {
		System.out.println(element);
	}
	  }
	
		
	}	
		
	

