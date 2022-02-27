package com.mphasis.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		
		File file = new File("src/test.txt"); 
		
		
		
		try {
			System.out.println(file.createNewFile()); 
			FileWriter writer = new FileWriter(file); 
		writer.write("hello friend"); 
		writer.flush(); 
		
			FileInputStream reader = new FileInputStream(file); 
			
			int num = 0; 
			while((num=reader.read()) != -1) { 
				
				System.out.println((char)num);
			}
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				

	}

}
