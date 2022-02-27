package com.mphasis;

public class Demo {

	public static void main(String[] args) {
		
		
		 InnerDemo d  = new Demo.InnerDemo();
		 
		 d.InnerDemo();

	}

	
	public static class InnerDemo {
		
		public void InnerDemo() { 
			
			System.out.println("demo from inner calss");
		}
	}
}
