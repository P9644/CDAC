import java.util.Scanner;

public class Leap_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean Leap = false;

        switch (year % 4 == 0 ? (year % 100 == 0 ? (year % 400== 0 ? 0 : 1) : 0) : 1) {
            case 0:
                Leap = true;
                break;
            case 1:
                Leap = false;
                break;
        }

        if (Leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}