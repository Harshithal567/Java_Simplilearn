package com.mphasis.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static <Employee> void main(String[] args) {
	
		
		
		//Employee employee = new Employee(102, "banerjee", 35000);
		
		
		try {
			
			//serialization
			
			/*
			 * FileOutputStream fos = new FileOutputStream("data.ser");
			 * 
			 * ObjectOutputStream oos = new ObjectOutputStream(fos);
			 * 
			 * oos.writeObject(employee);
			 * 
			 * System.out.println("Below object Serialization done");
			 * System.out.println(employee );
			 */
			 
			// De-serialization
			
			  FileInputStream fis = new FileInputStream("data.ser");
			  
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  
			
			  Employee emp = (Employee) ois.readObject();
			  
			  System.out.println(emp);
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
			 
		

	}

}
