package com.example.InterfaceExample;

public class Square implements Shape1 {

    double side = 5.6;

    @Override
    public void calculate_area() {
        double result = side * side;
        System.out.println("Area of square = " + result);
    }
}

