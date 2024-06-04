package Inheritance;

class Employee{
    void salary(){
        System.out.println("Salary: 500000");
    }
}

class Hr extends Employee{
    void bonus(){
        System.out.println("Bonus: 400000");
    }
}


public class SinlgleInheritance {
    public static void main(String[] args) {
        
        Hr emp1 = new Hr();
        emp1.salary();
        System.out.println();
        emp1.bonus();
    }
}
