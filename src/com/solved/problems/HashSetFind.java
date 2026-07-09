package com.solved.problems;
import java.util.*;

public class HashSetFind {

    private boolean[] set;

    public HashSetFind() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {

        HashSetFind hs = new HashSetFind();

        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println("Contains 10: " + hs.contains(10));
        System.out.println("Contains 15: " + hs.contains(15));

        hs.remove(10);

        System.out.println("After removing 10");
        System.out.println("Contains 10: " + hs.contains(10));
    }
}