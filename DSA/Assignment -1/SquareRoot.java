public class SquareRoot {
    public static int squareRoot(int x) {
        int start = 0; 
		int end = x;
		int ans = 0;
		
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == x)
				return mid;
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(16));  
        System.out.println(squareRoot(27));  
    }
}
