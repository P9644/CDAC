import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    private int employeeId;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.employeeId = ++totalEmployees;
        this.name = name;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    public static void applyRaise(ArrayList<Employee> employees, double percentage) {
        for (Employee emp : employees) {
            totalSalaryExpense += emp.salary * percentage / 100;
            emp.salary += emp.salary * percentage / 100;
        }
    }

    public void updateSalary(double newSalary) {
        totalSalaryExpense += newSalary - this.salary;
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;
        
        do {
            System.out.println("1. Add Employee 2. Total Employees 3. Apply Raise 4. Update Salary 5. Total Salary Expense 6. Show Employee 7. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new Employee(name, salary));
                    break;
                case 2:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;
                case 3:
                    System.out.print("Raise percentage: ");
                    double percentage = sc.nextDouble();
                    Employee.applyRaise(employees, percentage);
                    break;
                case 4:
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Salary: ");
                    double newSalary = sc.nextDouble();
                    employees.get(id - 1).updateSalary(newSalary);
                    break;
                case 5:
                    System.out.println("Total Salary Expense: " + Employee.getTotalSalaryExpense());
                    break;
                case 6:
                    System.out.print("Employee ID: ");
                    id = sc.nextInt();
                    System.out.println(employees.get(id - 1));
                    break;
            }
        } while (choice != 7);
        sc.close();
    }
}
