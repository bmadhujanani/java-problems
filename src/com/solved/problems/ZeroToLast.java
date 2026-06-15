package com.solved.problems;
import java.util.*;
public class ZeroToLast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

	    String[] strArr = input.split(" ");
	
	    int[] arr = new int[strArr.length];
	
	    for (int i = 0; i < strArr.length; i++) {
	        arr[i] = Integer.parseInt(strArr[i]);
	    }
	    int[] result=new int[arr.length];
	    int k=0;
	
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] !=0) {
	        	result[k]=arr[i];
	        	k++;
	        }
	    }
	    for (int i = 0; i < arr.length; i++) {
	    	System.out.print(result[i] + " ");
	    }
	}
}
