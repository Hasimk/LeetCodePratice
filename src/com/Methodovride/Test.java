package com.Methodovride;

public class Test extends Methodoverride1 {
	
	public void  m1( ) {
		
		System.out.println("call m2");
		
	}

	public static void main(String[] args) {
		
		Methodoverride1 mb = new Test();
		
		mb.m1();
	}

}
