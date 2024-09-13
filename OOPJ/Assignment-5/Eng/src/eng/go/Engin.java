package eng.go;

class Vehicle {
 public void startEngine() {
     System.out.println("Vehicle engine is starting...");
 }

 public void stopEngine() {
     System.out.println("Vehicle engine is stopping...");
 }
}

class Car extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Car engine is starting with a key turn.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Car engine is stopping with a key turn.");
 }
}

class Motorcycle extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine is starting with a button press.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Motorcycle engine is stopping with a button press.");
 }
}

public class Engin {
 public static void main(String[] args) {
     Vehicle car = new Car();
     car.startEngine();
     car.stopEngine();

     System.out.println(); 
     Vehicle motorcycle = new Motorcycle();
     motorcycle.startEngine();
     motorcycle.stopEngine();
 }
}
