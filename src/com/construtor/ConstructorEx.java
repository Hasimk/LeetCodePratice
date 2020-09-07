package com.construtor;

public class ConstructorEx {
	
	int id;
	String name;
	public ConstructorEx(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
	 void display() {
		
		System.out.println(id+" "+name);
		
	}
	
public static void main(String[] args) {
	
	ConstructorEx con = new ConstructorEx(100, "Hasim");
	ConstructorEx con1 = new ConstructorEx(101, "Aasim");
	
	con.display();
	con1.display();
	
	
}
}
