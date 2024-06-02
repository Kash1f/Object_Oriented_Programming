package Lesson2;

class Student{
    String name;
    int age;
    int roll_no;

    public void printData(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }

}


public class Basic{
    public static void main(String[] args) {

        
        Student student1 = new Student();

        student1.name = "Ahmed";
        student1.age = 20;
        student1.roll_no = 1;
        student1.printData();

        //object2 -> just make a new object and the same variables of Student class can be used
        Student student2 = new Student();
        
        student2.name = "Arqam";
        student2.age = 22;
        student2.roll_no = 2; 

    }
}
