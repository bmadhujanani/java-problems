package com.solved.problems;

import java.util.*;
public class StringRotation {

	public static String RotationMethod(String s1, String s2) {

		if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
			return "True";
		}

		return "False";
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result=RotationMethod(str1,str2);
        System.out.println(result);
        
    }
}