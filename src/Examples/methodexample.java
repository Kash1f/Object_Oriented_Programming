

//initializing object using method

class Animal{
    String color;
    int age;

    //creating methods and passing two paramerts as per variable names
    void initObj(String c, int a){
        //initializing instance variable by local variable
        color = c; //value of c will be initialized to color variable
        age = a;
    }

    //this method will be called to print the variable values
    void display(){
        System.out.println(color + " " + age);
    }

}

public class methodexample {

    public static void main(String[] args) {
        Animal spike = new Animal();

        //calling method and providing values to it
        spike.initObj("black", 10);
        spike.display();
    }
    
}
