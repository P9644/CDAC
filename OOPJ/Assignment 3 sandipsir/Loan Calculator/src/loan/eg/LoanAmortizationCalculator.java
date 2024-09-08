package loan.eg;
import java.util.Scanner;

class LoanAmortizationCalculator {
    private double principal;  
    private double annualInterestRate;
    private int loanTerm;  
    private double monthlyPayment; 

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount (Principal in ₹): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        loanTerm = scanner.nextInt();
    }

    public void calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;  
        int numberOfMonths = loanTerm * 12;  


        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                         (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }


    public void printRecord() {
        double totalPayment = monthlyPayment * loanTerm * 12; 

        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: ₹%.2f\n", totalPayment);
    }


    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.calculateMonthlyPayment();
        calculator.printRecord();
    }
}
