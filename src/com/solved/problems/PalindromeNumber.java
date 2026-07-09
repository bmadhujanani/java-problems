package com.solved.problems;
import java.util.*;
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        PalindromeNumber obj = new PalindromeNumber();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if (obj.isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}
