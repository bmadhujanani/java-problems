package com.sorting.techniques;
import java.util.*;
public class MergeSortedArrays {
	static int[] sort(int[] a,int[] b) {
		int m=a.length;
		int n=b.length;
		int i=0;
		int j=0;
		int k=0;
		int[] c=new int[m+n];
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		
		while(i<m) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<n) {
			c[k]=b[j];
			j++;
			k++;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,3,4,8};
		int[] b= {1,2,5,9};
		int[] c=sort(a,b);
		System.out.println(Arrays.toString(c));

	}

}