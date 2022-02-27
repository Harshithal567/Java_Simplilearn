package com.mphasis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CollectionDemo {

	public static void main(String[] args) {
	
		
		Collection<Integer> list = new HashSet<Integer>(); 
		
		list.add(101); 
		System.out.println(list.add(102));
		list.add(103);
		list.add(104); 
		System.out.println(list.add(102));
		
		System.out.println(list); 
		
		Map<Integer, String> map = new HashMap<Integer,String>();

		map.put(1,"tom"); 
		map.put(2, "king"); 
		map.put(3, "smith"); 
		map.put(4, "khan");
		
		
		System.out.println(map);
		
	}

}
