package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(85);
		marks.add(56);
		marks.add(25);
		marks.add(75);
		marks.add(32);
		
		System.out.println(marks);
		
		long nooffailsstudent=marks.stream().filter(m->m<35).count();
				System.out.println(nooffailsstudent);
		
	}

}
