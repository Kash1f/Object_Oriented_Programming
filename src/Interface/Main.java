package Interface;

interface Car{
    //only declare the method, body won't be written here

    public void start();
}

class ElectricCar implements Car{

    //interface method body will be written here now
    public void start(){
        System.out.println("Electric car starts");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel car starts ");
    }
}
public class Main {
    public static void main(String[] args) {
        Car audi = new ElectricCar();
        Car civic = new DieselCar();
        audi.start();
        civic.start();
    }
    }
