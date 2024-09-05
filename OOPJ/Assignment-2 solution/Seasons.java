import java.util.Scanner;
class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number ");
        int month = sc.nextInt();

        String season;

        switch (month) {
            case 12: 
            case 1: 
            case 2:
                season = "Winter";
                break;
            case 3: 
            case 4: 
            case 5:
                season = "Spring";
                break;
            case 6: 
            case 7: 
            case 8:
                season = "Summer";
                break;
            case 9: 
            case 10: 
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month number";
        }

        System.out.println("The season is: " + season);
    }
}
