package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMap {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(80);
		marks.add(75);
		marks.add(30);
		marks.add(25);
		
		System.out.println(marks);
		
		List<Integer> updateMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(updateMarks);

	}

}
