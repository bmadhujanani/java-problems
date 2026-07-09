package com.solved.problems;

public class ParkingSystem {

    private int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[4];
        slots[1] = big;
        slots[2] = medium;
        slots[3] = small;
    }

    public boolean addCar(int carType) {
        if (slots[carType] > 0) {
            slots[carType]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ParkingSystem parking = new ParkingSystem(1, 1, 0);

        System.out.println(parking.addCar(1)); // Big car
        System.out.println(parking.addCar(2)); // Medium car
        System.out.println(parking.addCar(3)); // Small car
        System.out.println(parking.addCar(1)); // Another big car
    }
}
