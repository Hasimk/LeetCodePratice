package com.list;

import java.util.ArrayList;

public class CommanList {

	// main method 
    public static void main(String[] args) 
    { 
  
        // create ArrayList list1 
        ArrayList<String> list1 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list1.add("Hasim"); 
        list1.add("Hasim"); 
        list1.add("Khan"); 
        list1.add("Raj"); 
  
        // print list 1 
        System.out.println(list1);
  
        // Create ArrayList list2 
        ArrayList<String> 
            list2 = new ArrayList<String>(); 
  
        // Add values in ArrayList 
        list2.add("Hasim"); 
        list2.add("yes"); 
        list2.add("Raj"); 
        
             
  
        // print list 2 
        System.out.println(list2);
  
        // Create ArrayList list3 
        ArrayList<String> list3 = new ArrayList<String>(); 
  
        // Find common elements 
        // while iterating through list1 
        for (String temp : list2) { 
  
            // Check if theis element is 
            // present in list2 or not 
            if (list1.contains(temp)) { 
  
                // Since present, add it to list3 
                list3.add(temp); 
            } 
        } 
  
        // print common elements from list 3 
        System.out.println("Common elements: "+ list3); 
    } 
} 

