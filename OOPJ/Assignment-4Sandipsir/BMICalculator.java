
import java.util.Scanner;

class BMITracker {
    private double weight;
    private double height;
    private double bmi;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        setWeight(sc.nextDouble());
        System.out.print("Enter height (m): ");
        setHeight(sc.nextDouble());
    }

    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public String classifyBMI() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        System.out.printf("Your BMI is: %.2f\n", getBmi());
        System.out.println("You are classified as: " + classifyBMI());
    }
}

public class BMICalculator {
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.printRecord();
    }
}
	
