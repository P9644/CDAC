package org.arra;
import java.util.Scanner;

public class Aray {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        int[] arr = new int[5];
        System.out.println("default values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] " + i + " = " + arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers to update the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for arr[i] " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" Updated values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr " + i + "  = " + arr[i]);
        }
        sc.close();
    }
}
/*1.	Declare a single-dimensional array of 5 integers 
 inside the main method. Traverse the array to print the
default values. Then accept records from the user and print the updated values of the array.*/
 