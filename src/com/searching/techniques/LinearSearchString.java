package com.searching.techniques;

public class LinearSearchString {

    public static int search(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        String str = "education";
        char target = 'a';

        int result = search(str, target);

        if (result != -1) {
            System.out.println("Character found at index: " + result);
        } else {
            System.out.println("Character not found");
        }
    }
}
