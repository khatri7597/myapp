package com.myapp.myapp;

import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args) {
		// ----------hashtable -------------------------
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
				// ht.put(null,"ajay");
				ht.put(101, "Vijay");
				ht.put(102, "Ravi");
				ht.put(103, "Rahul");
				System.out.println("-------------Hash table--------------");
				for (Map.Entry m : ht.entrySet()) {
					System.out.println(m.getKey() + " " + m.getValue());
				}

				// ----------------hashmap--------------------------------
				HashMap<Integer, String> hm = new HashMap<Integer, String>();
				hm.put(100, "Amit");
				hm.put(104, "Amit"); // hash map allows duplicate values
				hm.put(101, "Vijay");
				hm.put(102, "Rahul");
				System.out.println("-----------Hash map-----------");
				for (Map.Entry m : hm.entrySet()) {
					System.out.println(m.getKey() + " " + m.getValue());
				}
			}
		});
		thread.start();
	}
}