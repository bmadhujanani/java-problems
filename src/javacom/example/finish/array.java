package javacom.example.finish;

import java.util.Scanner;
/*
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];

        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr1[k] + arr2[k]);
        }

        sc.close();
    }*/




/*
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}*/




/*public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest=arr[0];
        
        
        for (int i = 1; i < arr.length; i++) {
        	if(arr[i]>largest) {
        		largest=arr[i];
        	}
        	 
        }
        System.out.print(largest);
    }
}*/





public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest=arr[0];
        int secondlargest=arr[0];
        
        
        for (int i = 1; i < arr.length; i++) {
        	if(arr[i]>largest) {
        		largest=arr[i];
        	}
        	 
        }
        for (int i = 1; i < arr.length; i++) {
        	if((arr[i]>secondlargest)&&(arr[i]<largest)) {
        		secondlargest=arr[i];
        	}
        }
        System.out.println(secondlargest);
    }
}
