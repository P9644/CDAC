package org.arra;
import java.util.*;

public class ArrayOperations2 {

    private int[] array;

    public ArrayOperations2(int size) {
        array = new int[size];  
    }

    public void setElement(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

    public int getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("Invalid index");
            return -1;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayOperations2 arrayOps = new ArrayOperations2(5);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            arrayOps.setElement(i, value);
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayOps.getElement(i) + " ");
        }
        System.out.println();
    }
}


/*
8.	Modify the previous assignment to use getter and setter 
methods instead of acceptRecord and printRecord*/
