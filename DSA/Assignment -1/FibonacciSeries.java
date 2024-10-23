import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static List<Integer> fibonacci(int n) {
        List<Integer> series = new ArrayList<>();
        int a = 0;
		int	b = 1;
        series.add(a);
		
        if (n > 1)
			series.add(b);
		
        for (int i = 2; i < n; i++) {
            int next = a + b;
            series.add(next);
            a = b;
            b = next;
        }
        return series;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); 
        System.out.println(fibonacci(8));  
    }
}
/*sum of previous two number is  next number
ex. 1,2,3,6,9
*/
