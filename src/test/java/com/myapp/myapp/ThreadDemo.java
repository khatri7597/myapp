package com.myapp.myapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadDemo implements Runnable {

	Thread t;

	ThreadDemo(String str) {

		t = new Thread(this, str);
		// this will call run() function
		t.start();
	}
	
	public static synchronized void print12() {
		//synchronized (this) {
			for (int i = 0; i < 5; i++) {
				// yields control to another thread every 5 iterations
				if ((i % 5) == 0) {
					System.out.println(Thread.currentThread().getName() + "yielding control..."+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSSSSSSSSSSSSSSSSSSSSSS").format(new Date()));

					/*
					 * causes the currently executing thread object to temporarily pause and allow
					 * other threads to execute
					 */
					// if(Thread.currentThread().getName().equals("Thread 1"))
					// Thread.yield();
				}
			}

			System.out.println(Thread.currentThread().getName() + " has finished executing.");
		//}
	}

	public void run() {

		ThreadDemo.print12();
	}

	public static void main(String[] args) {
		new ThreadDemo("Thread 1");
		new ThreadDemo("Thread 2");
		new ThreadDemo("Thread 3");
	}
}