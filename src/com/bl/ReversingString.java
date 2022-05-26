package com.bl;

public class ReversingString {

	public static void main(String[] args) {
		String example = "neha";
		System.out.println("Original String: "+example);
		StringBuilder reverseString = new StringBuilder(example);
		reverseString.reverse();
		String result = reverseString.toString();
		System.out.println("Reversed String: "+result);
	}

}
