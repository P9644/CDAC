package org.arra;
import java.util.Scanner;

public class ArrayOperations {
    private int[] array;
    public ArrayOperations(int size) {
        array = new int[size];  
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void printRecord() {
        System.out.println("Array elements are:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayOperations arrayOps = new ArrayOperations(5);
        arrayOps.acceptRecord();
        arrayOps.printRecord();
    }
}

/*
7.	Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality.
*/
