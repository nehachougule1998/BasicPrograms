package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.forEach(System.out::println);
		list.forEach((n)->print(n));

	}
	public static void print(Integer n) {
		System.out.println(n);
	}

}
