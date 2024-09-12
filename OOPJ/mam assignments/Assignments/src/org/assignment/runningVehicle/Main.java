package org.assignment.runningVehicle;


class Vehicle {
 public void startEngine() {
     System.out.println("Vehicle engine starting...");
 }

 public void stopEngine() {
     System.out.println("Vehicle engine stopping...");
 }
}

class Car extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Car engine starting with a smooth purr...");
 }

 @Override
 public void stopEngine() {
     System.out.println("Car engine stopping with a soft rumble...");
 }
}

class Motorcycle extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine roaring to life...");
 }

 @Override
 public void stopEngine() {
     System.out.println("Motorcycle engine stopping with a growl...");
 }
}

public class Main {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     System.out.println("Testing Car:");
     myCar.startEngine();
     myCar.stopEngine();
     
     Vehicle myMotorcycle = new Motorcycle();
     System.out.println("\nTesting Motorcycle:");
     myMotorcycle.startEngine();
     myMotorcycle.stopEngine();
 }
}
