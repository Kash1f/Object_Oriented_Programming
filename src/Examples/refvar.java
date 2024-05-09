

//initializing object using reference variable
class Animal{
    int age;
    String color;
}
public class refvar {
    public static void main(String[] args) {
        Animal spike = new Animal();

        //here these 2 are reference variables
        spike.age = 2;
        spike.color = "grey"; 

        System.out.println(spike.color + " " + spike.age );
    }
}
