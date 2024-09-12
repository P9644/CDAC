package org.arra;

public class Max {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 67, 34, 89, 21};
        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        return min;
    }
}
/*
3.Write a program to find the maximum and minimum values 
in a single-dimensional array of integers.
*/