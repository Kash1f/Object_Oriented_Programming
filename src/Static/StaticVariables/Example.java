package Static.StaticVariables;

// class Test {
//     static int a = 10;

//     void test() {
//         int b = 20;
//         System.out.println(b);
//     }
// }

// public class Example {
//     public static void main(String[] args) {
//         System.out.println(Test.a);

//         Test obj = new Test();
//         obj.test();
//     }
// }

class Test
{
     static int a = 10;
}

public class Example {
    public static void main(String[] args) {

        System.out.println(Test.a);
        
        //incase of non static variable
        Test obj = new Test();
        System.out.println(obj.a);
       
    }
}

//The main use of static variables is memory management. static variables are stored in the memory of the class and not in the memory of the object.