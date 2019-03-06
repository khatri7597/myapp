package com.myapp.myapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Abc {
	Abc() {
		System.out.println("Abc Default");
	}

	Abc(String str) {
		System.out.println("Abc str");
	}
}

public class MethodCheck extends Abc {

	public static void test(int i) {
		// No correct as base condition leads to
		// non-stop recursion.
		if (i == 0)
			return;
		else {
			test(i++);
		}
	}

	MethodCheck() {
		super("");
		System.out.println("default");
	}

	MethodCheck(int a) {
		this();
		System.out.println("a");
	}

	MethodCheck(int a, int b) {

		System.out.println("ab");
	}

	public static void Test(String str) {
		System.out.println("String");
	}

	public static void Test(Object obj) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test(5);

		/*
		 * Map<String, Integer> map = new HashMap<String, Integer>();
		 * 
		 * // Insert some sample key-value pairs. map.put("Key1", 1); map.put("Key2",
		 * 2); map.put("Key3", 3);
		 * 
		 * Remove a value of the map, while iterating over it. The following code throws
		 * a java.util.ConcurrentModificationException. for(String key: map.keySet()) {
		 * if(map.get(key) == 1) map.remove(key); }
		 * System.out.println("Successfully removed a pair!");
		 */
		
		List<String> list = new ArrayList<String>();
		 
        // Insert some sample values.
        list.add("Value1");
        list.add("Value2");
        list.add("Value3");

        // Get an iterator.
        Iterator<String> ite = list.iterator();

        /* Remove the first object of the list. This statement will force the iterator
         * to throw a ConcurrentModificationException. */
        //list.remove(0);

        while(ite.hasNext()) {
            String value = ite.next();
            if(value.equals("Value2"))
                 ite.remove();
            else
                 System.out.println(value);
       }
		
		/*
		 * Test(null);
		 * 
		 * String n = "alaatus", a[]; Set<String> set = new HashSet<String>(); int
		 * i,j,l; a=n.split(""); l = a.length; for(i=0; i<l; i++){ for(j=i+1; j<l; j++){
		 * if(a[i].equals(a[j])) { set.add(a[i]); } } } System.out.println(set);
		 */

	}

}
