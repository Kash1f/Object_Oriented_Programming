package Lesson2;

class Student{
    String name;
    int age;
    int roll_no;
}


public class Basic{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ahmed";
        student1.age = 20;
        student1.roll_no = 1;
        System.out.println(student1.name);
    }
}
