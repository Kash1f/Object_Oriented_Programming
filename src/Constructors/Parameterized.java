package Constructors;

//jese hi object banay to foran run hojai code

class Students{
    int id;
    int age;


    Students(int id, int age){
        this.id = id;
        this.age = age;
        System.out.println("Parameterized Constructor");
        
    }

    Students(){
        System.out.println("Default Constructor");
    }

    Students(int id, String name, int age){
        System.out.println("Parameterized Constructor 2");
    }
}
public class Parameterized {
    public static void main(String[] args) {
        Students obj = new Students(4, "Kashif", 19);
    }
}
