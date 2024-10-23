public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
		int count = 1;
        if (arr.length == 0)
			return 0;
      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};  
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};  
		
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
    }
}
