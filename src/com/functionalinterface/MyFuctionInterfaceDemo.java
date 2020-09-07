package com.functionalinterface;

public class MyFuctionInterfaceDemo {

	public static void main(String[] args) {
		
		
		  MyFunctionalnterface ctx =new MyFunctionalnterface() {
		  
		  @Override public void test() {
		  
		  System.out.println("Native implemention of functional interface");
		  
		  } }; ctx.test();
		 
	

	MyFunctionalnterface ctx1 = ()-> System.out.println("Lamda expression");
	
	ctx1.test();
	
	
	}


}