package org.assignment.vehicle;

class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}


class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
      
        super(make, year);
        this.model = model;
    }

    
    public String getModel() {
        return model;
    }

  
    @Override
    public void displayDetails() {
        
        super.displayDetails();
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", 2017, "Creta");

        car.displayDetails();
    }
}
