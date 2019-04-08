package com.myapp.myapp;

public class WaitEx {
	
	void test() {
		System.out.println("In test");
		try {
			wait();
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Out test");
	}
	
	public static void main(String[] args) {
		
		WaitEx ex = new WaitEx();
		Thread t = new Thread(new Runnable() {
			public void run() {
				
				ex.test();	
				
			}
		});
		t.start();
		System.out.println("Done");
	}

}
