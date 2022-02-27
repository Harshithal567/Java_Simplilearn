package com.mphasis.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		//Employee employee = new Employee(101, "javeed", 50000);

		try { 
			//FileOutputStream fos = new FileOutputStream("data.ser");
			
		//	ObjectOutputStream oos = new ObjectOutputStream(fos);
			//oos.writeObject(employee);
			
			//System.out.println("Serialization done"); 
			
			FileInputStream fis = new FileInputStream("data.ser"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = null;
			try {
				emp = (Employee) ois. readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
