package com.mphasis.exp;

public class Main {

	public static void main(String[] args) {
		
		
		//throw new ArithmeticException();

		System.out.println("Welcome to Mphasis Bank");
		
		int accounts [] = {101, 102, 103, 104, 105};
		String names [] = {"smith", "king","ford","scott","tom"};
		double balance[] = {5000.0,7000.0,8000.0,300.0,1000.0}; 
		
		for (int i = 0; i < accounts.length; i++) { 
			
			System.out.println(accounts[i]+" "+names[i]+" "+balance[i]);
			
			if(balance[i] <1000) {
				
				try {
				throw new LowBalanceException();
				}catch(LowBalanceException e) {
					
					System.err.println(names[i]+" Your balance is low please deposit some amount");
				}
			}
			
		}
		
		
		
	}

}
