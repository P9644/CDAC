public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(54, 24));  
        System.out.println(findGCD(17, 13));  
    }
}
/*GCD of two numbers is the largest number
 that divides both without leaving a remainder
 */