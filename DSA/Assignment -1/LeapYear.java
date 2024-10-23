public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));  
        System.out.println(isLeapYear(1900));  
    }
}
/*leap year once in  4 year
year%4==0
*/