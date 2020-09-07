package com.construtor;

public class ConsOverloading {

	int id;
	String name;
	int age;
	
	public ConsOverloading(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}
	
public ConsOverloading(int id, String name, int age) {
		
		this.id=id;
		this.name=name;
		this.age=age;
		
	}

     void display() {
    	 System.out.println(id+" "+name+" "+age);
    	 
     }
	public static void main(String[] args) {
		
		ConsOverloading con= new ConsOverloading(100, "Javed");
		ConsOverloading con1= new ConsOverloading(101, "Hasim",25);
		
		con.display();
		con1.display();

	}

}
