import java.util.Scanner;
 class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape number to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice:  ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1: 
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                area = 3.142 * radius * radius;
                break;

            case 2:
                System.out.print("Enter side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;

            case 3: 
                System.out.print("Enter  length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;

            case 4: 
                System.out.print("Enter  base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;

            default:
                System.out.println("Invalid input");
        }

        System.out.println("The area is: " + area);
    }
}
