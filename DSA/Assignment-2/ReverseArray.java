import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0
		int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};  
        int[] arr2 = {7, 8, 9};  
        reverseArray(arr1);
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
