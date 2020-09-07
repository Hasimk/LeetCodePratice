package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(105, "Hasim"));
		list.add(new Student(102, "Ahmad"));
		list.add(new Student(103, "Mohammad"));
		
		Collections.sort(list);
		
		for(Student s : list) {
			
			System.out.println(s);
		}
		

	}

}
