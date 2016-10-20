package com.sachinsarawgi.efficient;

import java.util.Arrays;
import java.util.Scanner;

//This program is an implementation of Binary Search in Java
public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		Integer[] array = new Integer[arraySize]; 
		int key = -1;
		
		for(int i=0 ;i<arraySize; i++){
			
			array[i] = scan.nextInt();
		}
		System.out.println("Array before sort "+Arrays.deepToString(array));
		mergeSort(array, 0, arraySize);
		System.out.println("Array before sort "+Arrays.deepToString(array));
		
		int testCases = scan.nextInt();
		int[] ans = new int[testCases];
		
		for(int i=0; i<testCases; i++){
			key = scan.nextInt();
			ans[i] = binarySearch(array, key) + 1;
			System.out.println("Found "+ans[i]);
		}
		
		for(int i=0; i<testCases; i++){
			System.out.println(ans[i]);
		}
	}
	
	//This function takes the array as input and return the index position where it found the key
	public static int binarySearch(Integer[] arr, int key){
		
		int low = 0;
		int high = arr.length;
		int mid = 0;
		
		while(low<high){
			
			mid = (low + high)/2;
			System.out.println("Position "+mid+" value is "+arr[mid]);
			if(arr[mid]<key){
				low = mid +1;
			}else if(arr[mid]>key){
				high = mid -1;
			}else{
				return mid;
			}
		}
		return low;	
	}
	
	public static void mergeSort(Integer[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        mergeSort(a, low, mid); 
        mergeSort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
}
