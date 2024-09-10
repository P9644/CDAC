
import java.util.Scanner;

class DiscountCalculators {
    private double originalPrice;
    private double discountRate;
    private double discountAmount;
    private double finalPrice;

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price (₹): ");
        setOriginalPrice(sc.nextDouble());
        System.out.print("Enter the discount percentage: ");
        setDiscountRate(sc.nextDouble());
    }

    public void calculateDiscount() {
        discountAmount = originalPrice * (discountRate / 100);
        finalPrice = originalPrice - discountAmount;
    }

    public void printRecord() {
        System.out.printf("Discount Amount: ₹%.2f\n", getDiscountAmount());
        System.out.printf("Final Price: ₹%.2f\n", getFinalPrice());
    }
}

public class DiscountCalculator {
    public static void main(String[] args) {
        DiscountCalculators calculator = new DiscountCalculators();
        calculator.acceptRecord();
        calculator.calculateDiscount();
        calculator.printRecord();
    }
}

