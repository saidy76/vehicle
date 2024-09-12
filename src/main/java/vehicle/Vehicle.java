package vehicle;

import java.util.ArrayList;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String colour;
    
    public Vehicle(String brand, String model, double price, String colour) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

   
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Colour: " + colour + ", Price: " + price;
    }

    public static class Car extends Vehicle {
        private int releaseYear;

        public Car(String brand, String model, double price, String colour, int releaseYear) {
            super(brand, model, price, colour);
            this.releaseYear = releaseYear;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

     
        public String toString() {
            return super.toString() + ", Release Year: " + releaseYear;
        }
    }

    public static class Motorcycle extends Vehicle {
        private int mileage;

        public Motorcycle(String brand, String model, double price, String colour, int mileage) {
            super(brand, model, price, colour);
            this.mileage = mileage;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

    
        public String toString() {
            return super.toString() + ", Mileage: " + mileage + " kmh";
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> transport = new ArrayList<>();

        Car car1 = new Car("BMW", "xyz", 12500000.00, "red", 2021);
        Motorcycle bike1 = new Motorcycle("Honda", "abc", 12000.00, "black", 120);
        Car car2 = new Car("Toyota", "abc", 15000000.00, "blue", 2022);
        Motorcycle bike2 = new Motorcycle("Yamaha", "def", 14000.00, "white", 130);

        transport.add(car1);
        transport.add(bike1);
        transport.add(car2);
        transport.add(bike2);

        for (Vehicle v : transport) {
            System.out.println(v.toString());
        }
    }
}
