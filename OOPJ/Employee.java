package org.example;
import java.util.Scanner;

class Empl{
	//fields
	 String name;		
	 int empid;		
	 String address;
	 float salary;
	
	//methods
	public void acceptRecord(/*this*/  ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("name	:	");
		this.name = sc.nextLine();
		System.out.print("empid	:	");
		this.empid = sc.nextInt();
		System.out.print("address	:	");
		this.address = sc.nextLine();
		sc.nextLine ();
		System.out.print("salary	:	");
		this.salary = sc.nextFloat();
	}
	
	public void printRecord( ) {
		System.out.println( "name	:	"+this.name+"  "+"empid	:	" +this.empid+" "+"address	:	"+this.address+ " "+"salary	:	"+this.salary);

	}
}

public class Employee{
	public static void main(String[] args) {
		Empl emp = new Empl( );//instance
		emp.acceptRecord( );//message passing emp.acceptRecord( emp (this))
		emp.printRecord( );
	}

}