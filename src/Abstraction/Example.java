package Abstraction;

abstract class Car{
    abstract public void fueltype();
    public void color(){
        System.out.println("Black");
    }
}

class Toyota extends Car{
    public void fueltype(){
        System.out.println("Diesel");
    }
}

class Honda extends Car{
    public void fueltype(){
        System.out.println("Gasoline");
    }
}


public class Example {
    public static void main(String[] args) {
        Toyota corolla = new Toyota();
        corolla.fueltype();
        corolla.color();
        Honda civic = new Honda();
        civic.fueltype();
        civic.color();

    }
}
