package org.arra;
import java.util.*;

public class Duplicat {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 20, 50};

        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for (int value : arr) {
            set.add(value);
        }
        
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int value : set) {
            uniqueArr[i++] = value;
        }
        
        return uniqueArr;
    }
}

	
/*4.	Write a program to remove duplicate
  elements from a single-dimensional array of integers.*/
 