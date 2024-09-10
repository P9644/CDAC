import java.util.Scanner;

class TollBoothRevenueManager {

    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    
    private int carCount;
    private int truckCount;
    private int motorcycleCount;
    
    private double totalRevenue;

    public double getCarRate() {
        return carRate;
    }

    public void setCarRate(double carRate) {
        this.carRate = carRate;
    }

    public double getTruckRate() {
        return truckRate;
    }

    public void setTruckRate(double truckRate) {
        this.truckRate = truckRate;
    }

    public double getMotorcycleRate() {
        return motorcycleRate;
    }

    public void setMotorcycleRate(double motorcycleRate) {
        this.motorcycleRate = motorcycleRate;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter toll rate for Car (₹): ");
        setCarRate(sc.nextDouble());
        
        System.out.print("Enter toll rate for Truck (₹): ");
        setTruckRate(sc.nextDouble());
        
        System.out.print("Enter toll rate for Motorcycle (₹): ");
        setMotorcycleRate(sc.nextDouble());
        
        System.out.print("Enter number of Cars passing through: ");
        setCarCount(sc.nextInt());
        
        System.out.print("Enter number of Trucks passing through: ");
        setTruckCount(sc.nextInt());
        
        System.out.print("Enter number of Motorcycles passing through: ");
        setMotorcycleCount(sc.nextInt());
    }

    public void calculateRevenue() {
        totalRevenue = (getCarRate() * getCarCount()) +
                       (getTruckRate() * getTruckCount()) +
                       (getMotorcycleRate() * getMotorcycleCount());
    }

    public void printRecord() {
        int totalVehicles = getCarCount() + getTruckCount() + getMotorcycleCount();
        System.out.printf("Total number of vehicles: %d\n", totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f\n", getTotalRevenue());
    }
}

public class TollBooth {
    public static void main(String[] args) {
        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();
        tollBooth.acceptRecord();
        tollBooth.calculateRevenue();
        tollBooth.printRecord();
    }
}