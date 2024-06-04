package Inheritance;

class A{
    void methodA(){
        System.out.println("Method A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method B");
}
}

//class C is indirectly accessing class A
class C extends B{
    void methodC(){
        System.out.println("Method C");
}
}


public class MultiLevel {
    public static void main(String[] args) {
        
    //We can access attributes of class A % B by creating object of class C

        C c = new C();
        
        c.methodA();
        c.methodB();
        c.methodC();

    }
}
