package Inheritance;

class Vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price: " + price);
        System.out.println("Mileage: "+ mileage);
        System.out.println("Color: " + color);
    }
}

class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;

    void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: "+ mileage);
        System.out.println("Sunroof: " + sunroof);
    }
}

public class VehicleCar {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.brand = "Toyota";
    car1.price = 1600000;
    car1.mileage = 20.3;
    car1.ftype = "Petrol";
    car1.color = "Black";
    car1.sunroof = true;
    car1.display();
    car1.show();

    }
}

//childclass k object ki help se parentclass k method ko access
//parentclass ka display() function tha to wo dubara banane ki zarurat nahi pari,
//parentclass wala display() functoion hi use karliya