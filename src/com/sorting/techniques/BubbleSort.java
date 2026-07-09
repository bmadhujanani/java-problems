package com.example.Sorting.BubbleSorting;

import java.util.Arrays;

public class BubbleSort {

	static void sortAsec(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	static void sortDecs(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,3,2,4,1};
		sortAsec(arr);
		System.out.println(Arrays.toString(arr));
		sortDecs(arr);
		System.out.println(Arrays.toString(arr));
 	}

}
