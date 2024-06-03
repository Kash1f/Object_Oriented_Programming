package Methods;

public class Student {

    int age;
    String name;

    public void showMethod(){
        System.out.println(name);
        System.out.println(age);
    }

    static void showStatic(){
        System.out.println("This is static method");
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ahmed";
        s1.age = 24; 

        s1.showMethod();
        showStatic();
    }
    
}

//Static methods to do not require objects whenever we call them

