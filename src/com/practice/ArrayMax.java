package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayMax {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(200);
		arr.add(95);
		
		Iterator<Integer> itr = arr.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("Maximum Element :" + Collections.max(arr));
		
	}

}
