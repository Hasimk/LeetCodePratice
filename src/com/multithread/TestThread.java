package com.multithread;

public class TestThread  extends Thread{
	
	public void run() {
		
		for (int i = 0; i <5; i++) {
			
			System.out.println("User Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		TestThread thread = new TestThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
			
			try {
				
				Thread.sleep(2000);
				
			} catch(InterruptedException e) {
				
				e.printStackTrace();
				
				
			}
		}
		

	}

}
