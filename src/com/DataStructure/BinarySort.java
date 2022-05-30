package com.DataStructure;

import java.util.Scanner;

public class BinarySort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		System.out.println("Enter Elements in Random Order: ");
				for(int i=0; i<n; i++)
					array[i] = scanner.nextInt();
		
		System.out.println("Sorting The Array");
		for(int i=0; i<(n-1); i++) {
			for(int j=0; j<(n-i-1); j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println("The new Sorted Array is: ");
		for(int i=0; i<n; i++)
			System.out.println(array[i]+" ");
		}
}
