package com.mphasis.vehicle;

public interface HardDisk {

	
	public int size();
	
	public String speed();
	
	public default String harsDiskType() { 
		
		return "magnetic disk"; 
		
	}
	  
	public static String weight() {
		
		
	return "100gm"; 
		
		
		
	}
	
	
}
