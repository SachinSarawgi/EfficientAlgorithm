package com.sachinsarawgi.efficient;

import java.util.Scanner;

//This program takes a number as input from user and prints whether the number is prime or not. 
public class FindInputNumberIsPrimeOrNot {

	//main method
	public static void main(String[] args) {
	
		//Used to take input from Console
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input a integer number: ");
		int number = scan.nextInt();
		
		System.out.print("The given number is ");
		if(isPrime(number))
			System.out.println("prime.");
		else
			System.out.println("not prime.");
	}
	
	//Program to check if a number is Prime or not.
	public static boolean isPrime(int num){
		
		if(num<=1)
			return false;
		else if(num<=3)
			return true;
		else if(num%2==0 || num%3==0)
			return false;
		int i=5;
		while(i*i<=num){
			if(num%i==0 || num%(i+2)==0)
				return false;
			i = i+6;
		}
		return true;
	}
}
