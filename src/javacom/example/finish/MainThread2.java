package javacom.example.finish;


public class MainThread2 extends Thread {

    public void run() {
        System.out.println("Table of 5");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
