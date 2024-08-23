/*class Calc{
public static void main(String args[]){
int a=5;
int b=3;
int c=3
switch(c){
case1: 
System.out.println(a+b);
break
case2: 
System.out.println(a-b);
break
case3: 
System.out.println(a*b);
break
case4: 
System.out.println(a/b);
break
default:System.out.println("iNVALID");

}}*/
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input: operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;
        boolean validOperation = true;

        // Perform calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                // Invalid operator
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        // Output the result if the operation was valid
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
    }
}
