public class Palindrome {
    public static boolean isPalindrome(int number) {
		 int original = number ;
		 int reversed = 0;
        if (number < 0) 
			return false;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   
        System.out.println(isPalindrome(-121));  
    }
}
/*a number which written in reverse order same as forward order
ex. 121=121
*/