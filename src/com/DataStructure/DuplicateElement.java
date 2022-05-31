package com.DataStructure;

import java.util.Scanner;

public class DuplicateElement {
	
	public void duplicateElementsInArray() {
		System.out.println("Enter the length of an array");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		int[] b = new int[length];
		
		//input the elements of an array
		System.out.println("Enter elements in array");
		for(int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//to find the duplicate elements
		for(int i = 0; i < length; i++) {
			int count = 1;
			if(arr[i] != -1)
			for(int j = i + 1; j < length; j++) {
				if(arr[i] == arr[j]) {
				//	System.out.println("Duplicate Elements are:" + arr[j]);
					count = count + 1;
					arr[j] = -1;
				}
			}
			b[i] = count;
		}
		
		System.out.println("Duplicate Elements and their frequency");
		for(int i = 0; i < length; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i] + " " + "frequency" + b[i] + " " + "times");
			}
		}
	}

	public static void main(String[] args) {
		DuplicateElement duplicateElement = new DuplicateElement();
		duplicateElement.duplicateElementsInArray();
	}
}