package com.string1;

public class Stringrev {
	
	public static void main(String[] args) {
		
		String rev="hello";
		
		char[] str=rev.toCharArray();
		
		System.out.println(rev);
		
		for (int i = str.length -1; i >= 0; i--) 
		
		System.out.println(str[i]);
	}

}
