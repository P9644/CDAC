package assign5.ls;

class Vehicle {
    // Attributes for make and year
    private String make;
    private int year;

    // Constructor to initialize make and year
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }

    // Getters for make and year (if needed for derived class)
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

// Derived class Car that extends Vehicle
class Car extends Vehicle {
    // Additional attribute for the model
    private String model;

    // Constructor to initialize make, year, and model
    public Car(String make, int year, String model) {
        // Call the constructor of the base class (Vehicle)
        super(make, year);
        this.model = model;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        // Call the base class method to display make and year
        super.displayDetails();
        System.out.println("Model: " + model);
    }
}

public class Vehcle {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 2021, "Corolla");

        // Display the car details
        System.out.println("Car Details:");
        myCar.displayDetails();
    }
}

/*2)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to initialize these attributes. Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. Write a program to create a Car object and display its details.*/
