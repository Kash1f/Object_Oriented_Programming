package Polymorphism;

// class OverloadingDemo{
//     void sum(int a, int b){
//         System.out.println(a+b);
//     }
//     void sum(int a, int b, int c){
//         System.out.println(a+b+c);
//     }
//     void sum(String a, String b){
//         System.out.println(a+b);
//     }
// }

// class Polymorphism{
//     public static void main(String[] args) {
//         OverloadingDemo obj = new OverloadingDemo();
//         obj.sum(5,7);
//         obj.sum(5,7,8);
//         obj.sum("Hp ", "Laptop");
//     }   

// }

class Bank{
    public void RateOfInterest(){
        System.out.println("Generally rate of interest is 7%");

    }
}

class MCB extends Bank{
    //MCB has the RateOfInterest Method as it extends Bank Class

    @Override //change the body i.e override it
    public void RateOfInterest(){  
        System.out.println("Rate of Interest of MCB is 6%");
    }
}

class UBL extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Generally rate of interest of UBL is 8%");
}
}

public class Polymorphism {
    public static void main(String[] args) {
        Bank objBank = new Bank();
        MCB obj = new MCB();
        UBL obj1 = new UBL();

        objBank.RateOfInterest();
        obj.RateOfInterest();
        obj1.RateOfInterest();
    }
}