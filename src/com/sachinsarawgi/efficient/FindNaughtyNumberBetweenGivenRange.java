package com.sachinsarawgi.efficient;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * A naughty number is one whose number of distinct prime factors is equal to the number of digits in its
 * decimal representation. The number 1 is considered a naughty number. 
 */ 

public class FindNaughtyNumberBetweenGivenRange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intArr = new int[2];
		System.out.print("Print the start and end point of range seperated by space ");
		for (int j = 0; j < 2; j++)
			intArr[j] = scan.nextInt();

		int numSucc = 0;
		for (int j = intArr[0]; j <= intArr[1]; j++) {
			if (String.valueOf(j).length() == findPrimeFactor(j)) {
				numSucc++;
			}
		}
		System.out.println("Naughty number between the range "+intArr[0]+" to "+intArr[1]+" is "+numSucc);
	}

	//This function returns distinct number of prime factors of a given number
	public static int findPrimeFactor(int n) {

		Set<Integer> primeFactors = new HashSet<>();

		if(n==1)
			return 1;
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				primeFactors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			primeFactors.add(n);
		}
		return primeFactors.size();
	}
}
