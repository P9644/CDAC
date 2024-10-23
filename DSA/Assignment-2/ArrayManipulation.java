public class ArrayManipulation {
    public static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n + 1];
        for (int[] query : queries) {
            int start = query[0] - 1;
            int end = query[1];
            int value = query[2];
            arr[start] += value;
            if (end < n) arr[end] -= value;
        }

        int max = 0, current = 0;
        for (int i = 0; i < n; i++) {
            current += arr[i];
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};  
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}}; 
        System.out.println(arrayManipulation(5, queries1));
        System.out.println(arrayManipulation(4, queries2));
    }
}
