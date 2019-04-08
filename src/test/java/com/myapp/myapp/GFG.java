package com.myapp.myapp;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map; 
  
class ThreadJoining extends Thread 
{ 
    @Override
    public void run() 
    { 
        for (int i = 0; i < 2; i++) 
        { 
            try
            { 
                Thread.sleep(500); 
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName()); 
            } 
  
            catch(Exception ex) 
            { 
                System.out.println("Exception has" + 
                                " been caught" + ex); 
            } 
            System.out.println(i); 
        } 
    } 
} 
public class GFG { 
  
    // function to sort hashmap by values 
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list         
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
        	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        		return (o1.getKey().compareTo(o2.getKey()));
        	}
        });
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
		/*
		 * HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 * 
		 * // enter data into hashmap hm.put("Math", 98); hm.put("Data Structure", 85);
		 * hm.put("Database", 91); hm.put("Java", 95); hm.put("Operating System", 79);
		 * hm.put("Networking", 80); Map<String, Integer> hm1 = sortByValue(hm);
		 * 
		 * // print the sorted hashmap for (Map.Entry<String, Integer> en :
		 * hm1.entrySet()) { System.out.println("Key = " + en.getKey() + ", Value = " +
		 * en.getValue()); }
		 */
    	ThreadJoining t1 = new ThreadJoining(); 
        ThreadJoining t2 = new ThreadJoining(); 
        ThreadJoining t3 = new ThreadJoining(); 
  
        // thread t1 starts 
        t1.start(); 
  
        // starts second thread after when 
        // first thread t1 has died. 
        try
        { 
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName()); 
            t1.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + 
                                "been caught" + ex); 
        } 
  
        // t2 starts 
        t2.start(); 
  
        // starts t3 after when thread t2 has died. 
        try
        { 
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName()); 
            t2.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has been" + 
                                    " caught" + ex); 
        } 
  
        t3.start();
    } 
} 