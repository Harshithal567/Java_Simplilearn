package com.mphasis.exp;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		
		try { 
			
			System.out.println("Hello");
			Thread.sleep(2000);
			System.out.println("Friends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
		
	}

}
