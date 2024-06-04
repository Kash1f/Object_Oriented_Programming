package Interface;

interface Bike{
    //only declare the method, body won't be written here

    public void start();
    public void stop();
}

interface ElectricBike{

    public void start();
    public void fullspeed();
}

class PetrolBike implements Bike, ElectricBike{
    public void start(){
        System.out.println("Petrol Bike starts ");
    }
    public void stop(){
        System.out.println("Bike stops");
    }
    public void fullspeed(){
        System.out.println("Full speed 400Mph");
    }
}
public class Interface {
    public static void main(String[] args) {
        
        PetrolBike honda = new PetrolBike();
        honda.start();
        honda.stop();
        honda.fullspeed();

    }
}

//Here there is only one object for the Petrol bike and rest we are using the methods of interfaces such as Bike and ElectricBike

//Aik object se we can access all the functionalities of the inherited classes that are being inherited into PetrolBike