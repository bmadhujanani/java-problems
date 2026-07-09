package com.sorting.techniques;

public class mainqs {
	public static void main(String[] args) {

	    int[] arr = {5, 12, 4, 9, 2, 7, 1, 10};

	    System.out.println("Before Sorting:");
	    System.out.println(Arrays.toString(arr));

	    quickSort(arr, 0, arr.length - 1);

	    System.out.println("After Sorting:");
	    System.out.println(Arrays.toString(arr));
	}
}
