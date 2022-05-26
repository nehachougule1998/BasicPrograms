package com.bl;

public class SwapTwoNo {

	public static void main(String[] args) {

        int FirstNumber = 4;
        int	SecondNumber = 8;

        System.out.println("Before Swaping The Number");
        System.out.println("First number = " + FirstNumber);
        System.out.println("Second number = " + SecondNumber);

        int temporary = FirstNumber;

        FirstNumber = SecondNumber;

        SecondNumber = temporary;

        System.out.println("After Swaping The Number");
        System.out.println("First number = " +FirstNumber);
        System.out.println("Second number = " +SecondNumber);
    }
}