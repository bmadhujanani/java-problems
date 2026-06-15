package com.solved.problems;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static Character firstNonRepeatingChar(String s) {
        if (s == null || s.isEmpty()) {
            return null; 
        }
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

    
        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) {
                return ch;
            }
        }

        return null; 
    }

    public static void main(String[] args) {
        String input = "aabbcde";
        Character result = firstNonRepeatingChar(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}