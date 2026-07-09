package com.example.InterfaceExample;

public class MainMethod {

    public static void main(String[] args) {

        Square sq = new Square();
        sq.calculate_area();

        System.out.println();

        Sphere sp = new Sphere();
        sp.calculate_area();
        sp.calculate_volume();
    }
}
