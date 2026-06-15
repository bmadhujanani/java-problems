package com.solved.problems;
import java.util.*;
public class FirstNonRepeatingLongestSubString{
    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;
        int start = 0;   

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }
        }

        System.out.println(s.substring(start, start + max));
    }
}

