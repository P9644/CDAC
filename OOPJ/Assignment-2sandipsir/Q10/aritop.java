package ten.aj;

import java.util.Scanner;


public class aritop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose operator +-*/");
		  char p = sc.next().charAt(0);
		System.out.println("first no");
		a=sc.nextDouble();
		System.out.println("second no");
		b=sc.nextDouble();
	        switch(p)
	        {
	            case '+':
	                System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
	                break;

	            case '-':
	                System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
	                break;

	            case '*':
	                System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
	                break;

	            case '/':
	                System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	                break;

	            case '%':
	                System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
	                break;


	            default:
	                System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
	        }
	        }

	    }

	
/*Arithmetic Operations with Command Line Input
Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).*/