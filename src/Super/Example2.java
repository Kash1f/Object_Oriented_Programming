package Super;

class A{
    int a = 10;
}

class B extends A{
    int a = 20;

    void show(int a){
    System.out.println(a); //30 since param a will receive arg 30 from main
    System.out.println(this.a); //20 since this.a refers to the instance variable of class B (current class)
    System.out.println(super.a); //10 since super.a refers to the instance variable of class A(parent class)
    }
}

public class Example2 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(30);
    }
}


/*

Uses of Super Keyword:

1. "super" keyword can be used to refer immediate parent class instance variable.
2. "super" keyword can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.

*/