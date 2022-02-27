package com.mphasis.diamond;

public class TestImp implements First , Second {

	public void show() { 
		
		First.super.show();
		Second.super.show();
		
	}
	
	public static void main(String[] args) { 
		
		TestImp test = new TestImp(); 
		
		test.show();
	
		
	}


}
