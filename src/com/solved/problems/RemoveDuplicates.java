package com.solved.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		Set<Integer> s= new TreeSet<Integer>();
		int[] arr = new int[n];
		System.out.println("Enter the sorted array");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			s.add(arr[i]);
		}
		
		System.out.println(s);
	}

}
