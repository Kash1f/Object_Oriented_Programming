package Encapsulation;

class Student{
    private String name;
    private int age;
    private int roll_no;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll_No(){
        return roll_no;
    }

    public void setName(String name){
    this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll_No(int age){
        this.roll_no = roll_no;
    }

}
public class Example2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Ahmed");
        obj.setAge(24);
        obj.setRoll_No(3);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll_No());
    }
    
}
