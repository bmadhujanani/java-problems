package com.searching.techniques;
import java.util.*;
public class LinearSearch2d {

    public static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 90;

        int[] result = search(arr, target);

        if (result[0] != -1) {
            System.out.println(" row " + result[0]
                    + " column " + result[1]);
        } else {
            System.out.println("Element not found");
        }
    }
}