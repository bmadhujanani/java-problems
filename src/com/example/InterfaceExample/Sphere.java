package com.example.InterfaceExample;

public class Sphere implements Shape1, Shape2 {

    double radius = 5.6;

    @Override
    public void calculate_area() {
        double result = 4 * pi * radius * radius;
        System.out.println("Surface area of sphere = " + result);
    }

    @Override
    public void calculate_volume() {
        double result = (4.0 / 3.0) * pi * radius * radius * radius;
        System.out.println("Volume of sphere = " + result);
    }
}