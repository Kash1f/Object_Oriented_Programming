package Inheritance;

class AMethod{
    public void print(){
        System.out.println("Class A Method");
    }
}

class BMethod extends AMethod{
    public void printB(){
        System.out.println("Class B Method");
    }
}

class CMethod extends AMethod{
    public void printC(){
        System.out.println("Class C Method");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        BMethod b = new BMethod();
        CMethod c = new CMethod();
        b.print();
        c.print();
    }
}
