package Methods;

public class Student {

    public void showMethod(){
        System.out.println("This is normal public method");
    }

    static void showStatic(){
        System.out.println("This is static method");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.showMethod();
        showStatic();
    }
    
}

//Static methods to do not require objects to be called

