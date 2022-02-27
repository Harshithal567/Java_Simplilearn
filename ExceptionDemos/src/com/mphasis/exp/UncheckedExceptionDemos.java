package com.mphasis.exp;

public class UncheckedExceptionDemos {

	public static void main(String[] args) {

		int num = 100;
		int result = 0;
				
		System.out.println("Open file");
		System.out.println("Read file");
		System.out.println("Process data");
		
		try {
		result = UncheckedExceptionDemos.div(4, 2); //main-caller
		}catch(ArithmeticException e) { 
			
			//e.printStackTrace();
			System.err.println("Sorry you can't div num by zero");
		}
		System.out.println(result);
		System.out.println("Close file");
		
	}

	
	public static int div(int num1, int num2)throws ArithmeticException { //callee
		
		
		return num1/num2;
		
	}
}
