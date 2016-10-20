package com.sachinsarawgi.efficient;

import java.util.*;

//This program is implementation of Merge Sort in Java
public class MergeSort {

	public static void main(String a[]) {
		
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		Integer[] array = new Integer[arraySize]; 
		
		for(int i=0 ;i<arraySize; i++){
			
			array[i] = scan.nextInt();
		}
		System.out.println("Array before sort "+Arrays.deepToString(array));
		mergeSort(array, 0, arraySize);
		System.out.println("Array before sort "+Arrays.deepToString(array));
	}
	
	//This function stakes an array as input and sort it using merge sort algorithm. 
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
