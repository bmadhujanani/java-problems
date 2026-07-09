package com.searching.techniques;
import java.util.*;
public class LinearSearch {
	static int linearsearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int result=linearsearch(arr,target);
		System.out.print("Index of your target: "+result);
	}

}
