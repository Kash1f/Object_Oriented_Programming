package Constructors.DefaultConstructor;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("blue", 10);
        Shirt shirt2 = new Shirt("cufflinks", true);

        System.out.println(shirt.color);
        System.out.println(shirt.size);
        System.out.println(shirt2.cuffling);
        System.out.println(shirt2.numberofButtons);

        shirt.putOn();
    }
}
