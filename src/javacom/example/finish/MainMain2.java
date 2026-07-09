package javacom.example.finish;

public class MainMain2 {

    public static void main(String[] args) {

        MainThread1 t1 = new MainThread1();
        MainThread2 t2 = new MainThread2();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();
    }
}