import java.util.Arrays;

public class LeftRotation {
    public static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[i] = arr[(i + d) % n];
        }
        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};  
        int[] arr2 = {10, 20, 30, 40};  
        System.out.println(Arrays.toString(rotateLeft(arr1, 2)));
        System.out.println(Arrays.toString(rotateLeft(arr2, 1)));
    }
}
