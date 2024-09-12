package org.arra;

import java.util.Scanner;

public class Arry_1 {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        int[] arr = new int[5];

        acceptRecord(arr);

        printRecord(arr);
    }
    
    public static void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[i]" + i + " : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    
    public static void printRecord(int[] arr) {
        System.out.println(" values of  array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] " + i + " = " + arr[i]);
        }
    }
}

/*2. Declare a single-dimensional array of 5 integers inside the main method.
  Define a method named acceptRecord to get input from the terminal into 
   the array and another method named printRecord to print the
    state of the array to the terminal.*/
