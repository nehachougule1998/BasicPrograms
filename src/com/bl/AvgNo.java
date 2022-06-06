package com.bl;

import java.util.Scanner;

public class AvgNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 = scanner.nextInt();
		System.out.println("Enter the 3rd number: ");
		int num3 = scanner.nextInt();
		scanner.close();
		System.out.println("the avg number is:" + avg(num1,num2,num3));
		AvgNo avgno = new AvgNo();
		avgno.compare(num1, num2, num3);
	}
	
	public static int avg(int a,int b, int c) {
		return(a + b + c) / 3;
	}
	
	public static void compare(int a, int b ,int c) {
		if(a>=b && a>=c)
			System.out.println(a + " is the largest number");
		else if(b>=a && b>=c)
			System.out.println(b+ "is the largest number");
		else
			System.out.println(c+ "is the largest number");
			
	}

}
