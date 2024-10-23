public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int orig = number;
		int sum = 0;
		int  digits = 0;
		
        while (orig != 0) {
            orig /= 10;
            digits++;
        }

        orig = number;

        while (orig != 0) {
            int digit = orig % 10;
            sum += Math.pow(digit, digits);
            original /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));  
        System.out.println(isArmstrong(123));  
    }
}
/*An Armstrong number is a number 
that equals the sum of its digits each 
raised to the power of the number of digits.
ex. 153=3digits
1^3+5^3+3^3=153
*/