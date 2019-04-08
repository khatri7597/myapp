package com.myapp.myapp;

class Table1 {
	static synchronized void printTable(int n) {
//		synchronized (this) {
			for (int i = 1; i <= 5; i++) {

				System.out.println(n * i);

				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	//}
}

class MyTestThread implements Runnable {

	/*
	 * Table1 table1;
	 * 
	 * public MyTestThread(Table1 table1) { super(); this.table1 = table1; }
	 */

	@Override
	public void run() {
		Table1.printTable(5);
	}

}

class MyTestThread1 implements Runnable {

	/*
	 * Table1 table1;
	 * 
	 * public MyTestThread1(Table1 table1) { super(); this.table1 = table1; }
	 */

	@Override
	public void run() {
		Table1.printTable(10);
	}

}

class MyTestThread2 implements Runnable {

	/*
	 * Table1 table1;
	 * 
	 * public MyTestThread1(Table1 table1) { super(); this.table1 = table1; }
	 */

	@Override
	public void run() {
		Table1.printTable(100);
	}

}

class MyTestThread3 implements Runnable {

	/*
	 * Table1 table1;
	 * 
	 * public MyTestThread1(Table1 table1) { super(); this.table1 = table1; }
	 */

	@Override
	public void run() {
		new Table1().printTable(1000);
	}

}

public class SyncTest {

	public static void main(String[] args) {


		Thread t1 = new Thread(new MyTestThread());
		Thread t2 = new Thread(new MyTestThread1());
		Thread t3 = new Thread(new MyTestThread2());
		Thread t4 = new Thread(new MyTestThread3());
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
