package Constructors.DefaultConstructor;

public class Shirt {
    public String color;
    public int size;
    public String cuffling;
    public boolean numberofButtons;

    Shirt() {
        System.out.println("This is a default constructor");
    }

    Shirt(String color, int size) {
        this.color = color;
        this.size = size;
    }

    Shirt(String cuffling, boolean hasButtons) {
        this.cuffling = cuffling;
        this.numberofButtons = hasButtons;
    }

    public static void putOn() {
        System.out.println("Putting on the shirt");
    }

    public static void putOff() {
        System.out.println("Putting off the shirt");
    }

}
