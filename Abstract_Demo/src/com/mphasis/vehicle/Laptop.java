package com.mphasis.vehicle;

public class Laptop {

	
	private HardDisk hd; 
	
	
	
	
	
	
	
	public Laptop(HardDisk hd) {
		super();
		this.hd = hd;
	}







	public static void main(String[] args) {
		
		
		
		HardDisk hd = new Samsung();
		Laptop laptop1 = new Laptop(hd);
		
		System.out.println(laptop1.hd.size()); 
		System.out.println(laptop1.hd.speed());
		System.out.println(hd.harsDiskType());
        System.out.println(HardDisk.weight());
	}

}
