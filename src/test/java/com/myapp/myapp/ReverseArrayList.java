package com.myapp.myapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;  
  
public class ReverseArrayList {  
public static void main(String[] args) {  
     List<Integer> list = new ArrayList<>();  
     list.add(10);  
     list.add(50);  
     list.add(30);  
     list.add(60);  
     list.add(20);  
     list.add(90);  
       
     Iterator<Integer> i = list.iterator();  
     System.out.println("printing the list....");  
     while(i.hasNext())  
     {  
         System.out.println(i.next());  
     }  
      
    Comparator cmp = Collections.reverseOrder();  
    Collections.sort(list,cmp);  
     System.out.println("printing list in descending order....");  
     Iterator i2 = list.iterator();  
     while(i2.hasNext())  
     {  
         System.out.println(i2.next());  
     }  
       
}  
}  