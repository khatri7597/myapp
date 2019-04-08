package com.myapp.myapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class EmloyeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"zeze"));
		list.add(new Employee(2,"asds"));
		list.add(new Employee(3,"gadd"));
		list.add(new Employee(4,"siue"));
		list.add(new Employee(5,"hitu"));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jayant", 80); 
        map.put("Abhishek", 90); 
        map.put("Anushka", 80); 
        map.put("Amit", 75); 
        map.put("Danish", 40); 
		
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(map);
		
		System.out.println(map);
		System.out.println(tmap);	
		
		IntStream strem = IntStream.range(0, 10).filter(i->i%2==0&&i>0);
		int[] arr = {3,3,8,8,8};
		
		int sum = IntStream.range(1, arr.length+1).filter(i->i%2!=0).map(i->arr[i-1]).sum();
		
		//strem.forEach(System.out::println);
		System.out.println(sum);
		
		IntStream stream1 = IntStream.of(-7); 
		  
        // Displaying the IntStream having single element 
        stream1.forEach(System.out::println); 
		
	}

}
