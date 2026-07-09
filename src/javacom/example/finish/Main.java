/*package javacom.example.finish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}*/






/*package javacom.example.finish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Elements:");
        for (int i = 0; i < rows; i++) {
        	int sumrow=0;
            for (int j = 0; j < cols; j++) {
                sumrow=arr[i][j]+sumrow;
            }
            System.out.println(sumrow);
        }

        sc.close();
    }
}*/








package javacom.example.finish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Elements:");
        for (int j = 0; j < cols; j++) {
        	int sumrow=0;
            for (int i = 0; i< rows;i++) {
                sumrow=arr[i][j]+sumrow;
            }
            System.out.println(sumrow);
        }

        sc.close();
    }
}