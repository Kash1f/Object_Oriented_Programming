package Methods;

class Bruno{
    String name;
    int age;

    public void eat(){
        System.out.println(name + " eats");
        System.out.println(age + " years old");
    }
}

public class Animal {
    public static void main(String[] args) {
        Bruno bruno = new Bruno();

        bruno.name = "bruno";
        bruno.age = 10;
        bruno.eat();

    }
}
