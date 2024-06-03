package Methods;

class Student{
    final String name = "Kashif";
    int rollNo;
    String address;
}




public class Attributes {

    public static void main(String[] args) {
        
        Student std1 = new Student();

        //name can't be changed as the string is declared with final keyword
        // std1.name = "Ahmed";
        System.out.println(std1.name);
    }
    
}
