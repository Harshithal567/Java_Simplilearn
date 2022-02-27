package com.mphasis.abstraction;

import java.util.Scanner;

public class AtmMachineUser {

	public static void main(String[] args) {
		
		
		System.out.println("****WELCOME TO MY ATM****"); 
		System.out.println("1.Deposit"); 
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		
		Scanner scanner = new Scanner(System.in); 
		
        int choice = scanner.nextInt();
        
        
        switch (choice) {
		case 1: 
			//deposit
			
			
		case 2:
			//withdraw
			
			break;
		case 3:
			    //exit
		
		default:
			break;
		}
	}

}
