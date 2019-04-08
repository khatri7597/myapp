package com.myapp.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class CopyArrayList {
	private final static Map<Integer,String> conHashMap = new HashMap<Integer,String>();
	  public static void main(String[] args) {
		  //ExecutorService  service = Executors.newFixedThreadPool(3);
		  Main ob = new Main();
		  //ob.new WriteThreasOne().start();
		  //ob.new WriteThreasTwo().start();
		  //ob.new ReadThread().start();
		  //service.execute(ob.new WriteThreasOne());
		  //service.execute(ob.new WriteThreasTwo());
		  //service.execute(ob.new ReadThread());
		  //service.shutdownNow();
		  
		  List<String> list = new ArrayList<String>();
		  Iterator<String> itr = list.iterator();
		  new Thread(() -> {
			  for(int i= 1; i<=100; i++) {
					conHashMap.put(i, "A"+ i);
				}	            
	        }).start();
		  new Thread(() -> {
			  for(int i= 1; i<=50; i++) {
					conHashMap.put(i, "B"+ i);
				}	            
	        }).start();
		  new Thread(() -> {
			  Iterator<Integer> ite = conHashMap.keySet().iterator();
		  	   while(ite.hasNext()){
		  		   Integer key = ite.next();
		  		   System.out.println(key+" : " + conHashMap.get(key));
			  }            
	        }).start();
	  }
	  
	  
	/*
	 * class WriteThreasOne implements Runnable {
	 * 
	 * @Override public void run() {
	 * 
	 * } } class WriteThreasTwo implements Runnable {
	 * 
	 * @Override public void run() { for(int i= 1; i<=5; i++) { conHashMap.put(i,
	 * "D"+ i); } } } class ReadThread implements Runnable {
	 * 
	 * @Override public void run() { Iterator<Integer> ite =
	 * conHashMap.keySet().iterator(); while(ite.hasNext()){ Integer key =
	 * ite.next(); System.out.println(key+" : " + conHashMap.get(key)); } } }
	 */
	  }
