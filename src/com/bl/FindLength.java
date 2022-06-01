package com.bl;

public class FindLength {

	public static void main(String[] args) {
		String str = "aabbccddef";
		int [] count = new int [500];
		
		for(int i=0; i<str.length(); i++) {
			count [(int)str.charAt(i)]++;
		}
		
		for(int i=0; i<256; i++) {
			if(count [i] !=0) {
				System.out.println((char)i + " "+count[i]);
			}
		}
	}

}
