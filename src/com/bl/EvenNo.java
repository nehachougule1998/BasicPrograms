package com.bl;

public class EvenNo {

	public static void main(String[] args) {
		int num = 10;
		System.out.println("list of even num from 1 to " + num + " : ");
		for(int i=1; i<=num; i++) {
			if(i%2 == 0) {
				System.out.println(i+ " ");
			}
		}

	}

}
