package toll.eg;
import java.util.Scanner;

class TollBoothRevenueManager {
    private double carRate; 
    private double truckRate;  
    private double motorcycleRate;  
    private int numCars;  
    private int numTrucks;  
    private int numMotorcycles;  
    private double totalRevenue; 

    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Cars (₹): ");
        carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Trucks (₹): ");
        truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycles (₹): ");
        motorcycleRate = scanner.nextDouble();
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Cars: ");
        numCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        numTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        numMotorcycles = scanner.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (numCars * carRate) + (numTrucks * truckRate) + (numMotorcycles * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = numCars + numTrucks + numMotorcycles;  
        System.out.println("Total number of vehicles: " + totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f\n", totalRevenue);
    }

    
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        manager.setTollRates();
        manager.acceptRecord();
        manager.calculateRevenue();
        manager.printRecord();
    }
}
