package com.bl;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p,r,t,sinterest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		p = sc.nextFloat();
		System.out.println("Enter the rate of interest: ");
		r = sc.nextFloat();
		System.out.println("Enter the time period: ");
		t = sc.nextFloat();
		sc.close();
		sinterest=(p*r*t)/100;
		System.out.println("simple interest is:" +sinterest);
	}
}
