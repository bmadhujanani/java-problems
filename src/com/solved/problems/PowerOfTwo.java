package com.solved.problems;
import java.util.*;
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        PowerOfTwo obj = new PowerOfTwo();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.isPowerOfTwo(n));
    }
}
