package com.collections.java;
import java.util.ArrayList;
import java.util.*;
public class CodeArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hello");
		list.add(null);
		list.add("java");
		
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i)+" ");
		 }
		 
		for(String s:list) {
			 System.out.println(list.set(0, s)+" ");
		 }

	}

}
