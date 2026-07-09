package com.collections.java;
import java.util.HashSet;
import java.util.*;
import java.util.TreeSet;
public class HashSetClass {

	/*public static void main(String[] args) {
		HashSet<Integer> s=new HashSet<Integer>();
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(2);
		s.add(null);
		s.add(null);
		
		System.out.println(s);

	}*/
	
//	public static void main(String[] args) {
//		TreeSet<Integer> s=new TreeSet<Integer>();
//		s.add(1);
//		s.add(3);
//		s.add(2);
//		s.add(2);
////		s.add(null);
////		s.add(null);
//		
//		System.out.println(s);
//
//	}
	

	    public static void main(String[] args) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int[] arr=new int[n];

//	        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};

	        HashSet<Integer> set = new HashSet<>();

	        for (int i=0;i<n;i++) {
	        	arr[i]=sc.nextInt(); 
	            set.add(arr[i]);
	        }

	        System.out.println(set);
	    }
}
	
	
	

