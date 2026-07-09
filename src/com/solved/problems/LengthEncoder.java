package com.solved.problems;
import java.util.*;
public class LengthEncoder{

    public static String compress(String str) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        // Add the last character and its count
        result.append(str.charAt(str.length() - 1));
        result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(compress(str));

        sc.close();
    }
}


