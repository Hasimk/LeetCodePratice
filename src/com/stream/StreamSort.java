package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
	
	

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();	
		marks.add(40);
		marks.add(50);
		marks.add(33);
		
		System.out.println(marks);
		
List<Integer> sortedList= marks.stream().sorted().collect(Collectors.toList());

System.out.println(sortedList);

List<Integer> sorteddescending = marks.stream().sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
System.out.println("==============================================");
System.out.println(sorteddescending);
	
		

	}
}

