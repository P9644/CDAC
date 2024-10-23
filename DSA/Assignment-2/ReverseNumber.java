public class ReverseNumber {
    public static int reverseNumber(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed * sign;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));  
        System.out.println(reverseNumber(-9876));  
    }
}
