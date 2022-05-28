package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AdditionWhileLoop {

		public static void main(String args[]) {
			List<Integer> list = new ArrayList<Integer>();
	        int sum = 0;
	        int count = 0;
	  
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	  
	        while (list.size() > count) {
	        	sum += list.get(count);
	        	count++;
	        }
	        System.out.println(" The sum of list is: " + sum);
	    }
	}