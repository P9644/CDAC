
import java.util.Scanner;

class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;
    private double monthlyPayment;
    private double totalAmountPaid;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount (₹): ");
        setPrincipal(sc.nextDouble());
        System.out.print("Enter the annual interest rate (in %): ");
        setAnnualInterestRate(sc.nextDouble());
        System.out.print("Enter the loan term (in years): ");
        setLoanTerm(sc.nextInt());
    }

    public void calculateMonthlyPayment() {
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
        int numberOfMonths = getLoanTerm() * 12;
        double powerTerm = Math.pow(1 + monthlyInterestRate, numberOfMonths);

        monthlyPayment = getPrincipal() * (monthlyInterestRate * powerTerm) / (powerTerm - 1);
        totalAmountPaid = monthlyPayment * numberOfMonths;
    }

    public void printRecord() {
        System.out.printf("Monthly Payment: ₹%.2f\n", getMonthlyPayment());
        System.out.printf("Total Amount Paid Over the Life of the Loan: ₹%.2f\n", getTotalAmountPaid());
    }
}

public class LoanCalculator {
    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.calculateMonthlyPayment();
        calculator.printRecord();
    }
}

