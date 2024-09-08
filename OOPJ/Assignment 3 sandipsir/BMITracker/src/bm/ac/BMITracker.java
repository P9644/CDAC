package bm.ac;

import java.util.Scanner;

class BMITracker {
    private double weight;  
    private double height;  
    private double bmi;  
    private String classification; 

  
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();
    }

 
    public void calculateBMI() {
        bmi = weight / (height * height);
    }

   
    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

   
    public void printRecord() {
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("BMI Classification: " + classification);
    }

   
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}
