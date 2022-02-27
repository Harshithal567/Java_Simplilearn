package com.mphasis.diamond;

public interface Second {
 
	
	default void show() { 
		
		System.out.println("Default show from Second");
		
	}
}
