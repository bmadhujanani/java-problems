package com.solved.problems;
import java.util.*;
public class ArraymaxMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strArr = input.split(" ");
        int[] arr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i].trim());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
	
}
