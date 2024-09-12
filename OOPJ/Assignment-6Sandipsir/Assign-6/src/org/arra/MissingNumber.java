package org.arra;
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] array = {1, 2, 3, 5};  

        int missingNumber = findMissingNumber(array, N);

        System.out.println("The missing number is: " + missingNumber);
    }
}
/*
6.	Write a program to find the missing number in an array of integers ranging from 1 to N.
*/
