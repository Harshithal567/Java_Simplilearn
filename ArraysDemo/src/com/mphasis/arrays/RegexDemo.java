package com.mphasis.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[abc]");
		
		Matcher matcher = pattern.matcher("javac"); 
		
		while(matcher.find()) { 
			System.out.println(matcher.start() + " "+matcher.group());
			
		}
		

	}

}
