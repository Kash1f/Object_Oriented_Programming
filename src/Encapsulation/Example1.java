package Encapsulation;

class Employee{
    private int empid;
    public void setEmpId(int eid){
        empid = eid;
    }
    public int getEmpId(){
        return empid;
    }
}


public class Example1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        System.out.println(emp.getEmpId());

    }
}
