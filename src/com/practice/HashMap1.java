package com.practice;

import java.util.HashMap;
import java.util.Map;


public class HashMap1 {
	
	public static void main(String[] args) {
		
	
	Map< Integer,String> mt = new HashMap<>();
	
	mt.put(101, "hk");
	mt.put(102, "ajay");
	
	System.out.println(mt);
	
	for(Map.Entry<Integer, String> mp:mt.entrySet()) {
		
		System.out.println(mp.getKey()+" "+mp.getValue());
		
		
	}
	
	}
	 
	
	
	
	

}
