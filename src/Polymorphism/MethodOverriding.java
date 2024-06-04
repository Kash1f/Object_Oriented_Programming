package Polymorphism;

class Bank{
    public void RateOfInterest(){
        System.out.println("Generally rate of interest is 5%");

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

public class MethodOverriding {
    public static void main(String[] args) {
        Bank objBank = new Bank();
        MCB obj = new MCB();
        UBL obj1 = new UBL();

        objBank.RateOfInterest();
        obj.RateOfInterest();
        obj1.RateOfInterest();
    }
}
