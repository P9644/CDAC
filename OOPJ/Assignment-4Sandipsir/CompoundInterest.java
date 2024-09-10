import java.util.Scanner;

class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    private double futureValue;
    private double totalInterest;

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

    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getFutureValue() {
        return futureValue;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial investment amount (₹): ");
        setPrincipal(sc.nextDouble());
        System.out.print("Enter the annual interest rate (in %): ");
        setAnnualInterestRate(sc.nextDouble());
        System.out.print("Enter the number of times interest is compounded per year: ");
        setNumberOfCompounds(sc.nextInt());
        System.out.print("Enter the investment duration (in years): ");
        setYears(sc.nextInt());
    }

    public void calculateFutureValue() {
        double ratePerPeriod = getAnnualInterestRate() / 100 / getNumberOfCompounds();
        int totalPeriods = getNumberOfCompounds() * getYears();
        
        futureValue = getPrincipal() * Math.pow(1 + ratePerPeriod, totalPeriods);
        totalInterest = futureValue - getPrincipal();
    }

    public void printRecord() {
        System.out.printf("Future Value: ₹%.2f\n", getFutureValue());
        System.out.printf("Total Interest Earned: ₹%.2f\n", getTotalInterest());
    }
}

public class CompoundInterest {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.calculateFutureValue();
        calculator.printRecord();
    }
}
