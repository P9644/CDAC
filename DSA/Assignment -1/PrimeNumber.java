import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) 
			return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
				return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29));  
        System.out.println(isPrime(15));  
    }
}
/*a number divisible by one and itself
29=29,1
19=19,1
*/