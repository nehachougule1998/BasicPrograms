package com.bl;
import java.util.ArrayList;

public class Hobbies {

	public static void main(String[] args) {
		try {
		String hobbies[]= {"Singing", "Travelling", "Reading"};
		System.out.print("my hobbies are ");
		for(int i=0; i<hobbies.length;i++) {
			System.out.print(hobbies[i]);
			if(i < hobbies.length-1) {
				System.out.print(", ");
			}
		}
		}
		catch(Exception e) {
		}
	}
}

		
	


