package com.myapp.myapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionImpl {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1231");
		list.add("123");
		list.add("123");
		list.add("123");
		list.stream();
		
		Iterator<String> it = list.iterator();
		list.remove("1231");
		while(it.hasNext()){
		    String obj = it.next();
		    it.remove();
		    System.out.println(obj);
		}
		
	}

}
