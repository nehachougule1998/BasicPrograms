package com.bl;

public class Factorial {

	public static void main(String[] args) {
		int factorial = fact(4);
		System.out.println("factorial of 4 is: "+factorial);
	}
	static int fact(int n) {
		int output;
		if(n == 1) {
			return 1;
		}
		output = fact(n-1)*n;
		return output;
	}

}
