package Static.StaticVariables;

class Employee {
    int emp_id;
    String name;
    static String company_name = "ABC";

    //defining constructor
    Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    //function to display the details
    void display() {
        System.out.println(emp_id + " " + name + " " + company_name);
    }

}

public class Example2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(110, "John");
        emp1.display();
        Employee emp2 = new Employee(120, "Tom");
        emp2.display();
    }
}
