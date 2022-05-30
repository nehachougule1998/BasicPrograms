package com.DataStructure;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int [] numArray = {4,1,8,3,6,9,10};
		System.out.println("Original array:" + Arrays.toString(numArray));
		
		for(int i=1; i<numArray.length-1; i++) {
			int temp = numArray[i];
			int j = i-1;
			while(j >= 0 && temp <= numArray[j]) {
				numArray[j + 1] = numArray[j];
				j = j-1;
			}
			
			numArray[j + 1] = temp;
		}
		
		System.out.println("Sorted Array: " + Arrays.toString(numArray));
	}

}
