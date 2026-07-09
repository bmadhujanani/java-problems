package javacom.example.finish;

public class MainThread1 extends Thread {
	
		
    public void run() {
        System.out.println("Table of 2");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
  
		
	}
}