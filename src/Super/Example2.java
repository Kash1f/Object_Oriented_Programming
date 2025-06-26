package Super;

class A{
    int a = 10;
}

class B extends A{
    int a = 20;

    void show(int a){
    System.out.println(a); //30 since param a will receive arg 30 from main
    System.out.println(this.a); //20 since this.a refers to the instance variable of class B
    System.out.println(super.a); //10 since super.a refers to the instance variable of class A(parent class)
    }
}

public class Example2 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(30);
    }
}
