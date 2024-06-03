package pp;

//Q4. b) Why is there a compilation error in the code? [3]
// final class X {
//     int m = 48;
// }

// class Y extends X {
//     void methodOfY() {
//         System.out.println(m);
//     }
// }

//Q4. d) An interface may contain [2]
// A. abstract methods
// B. variables and abstract methods
// C. constants and abstract methods
// D. constants, variables, and abstract methods
// E. constants, variables, abstract methods, and concrete methods


// //Q5. a) What will be the outcome of the following Java program? [5]

// abstract class A {
//     int i = 111, j = 222;
//     abstract void methodOne();
//     abstract void methodTwo();
// }

// abstract class B extends A {
//     void methodOne() {
//         System.out.println(i);
//         System.out.println(j);
//         i = ++i;
//         j = --j;
//     }
// }

// class C extends B {
//     void methodTwo() {
//         System.out.println(i);
//         System.out.println(j);
//         i = i++;
//         j = j--;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         C c = new C();
//         c.methodOne();
//         c.methodTwo();
//         System.out.println(c.i);
//         System.out.println(c.j);
//     }
// }

// //Output:
// // 111
// // 222
// // 112
// // 221
// // 112
// // 221

//Q5. b) Given the following definition of Bird and Chicken, which of the given statements will not compile? [2]

// abstract class Bird implements Livestock {}

// class Chicken extends Bird {}

// A) Bird bird = new Bird();
// B) Chicken chicken = new Chicken();
// C) Bird bird = new Chicken();
// D) Livestock livestock = new Chicken();

//Q5. c) What will be the outcome of executing the following Java program? [5]

abstract class X {
    public X() {
        System.out.println("From X");
    }
    abstract void abstractMethod();
}

class Y extends X {
    public Y() {
        System.out.println("From Y");
    }
    void abstractMethod() {
        System.out.println("From M");
    }
}

public class Main{
    public static void main(String[] args) {
        X x = new Y();
        x.abstractMethod();
    }
}

//Output:
// From X
// From Y
// From M

//Q5. d)  Can you identify the error in the below code? [2]

// abstract class AbstractClass {
//     private abstract int abstractMethod();
// }

//Q5. e)Does the below code compile successfully? If not, why? If yes, what is the output? [2]

// interface A {
//     int i = 10;
// }

// class B implements A {
//     void methodB() {
//         i = 100;
//         System.out.println(i);
//     }
// }


// Question 6 (Lab) (The Person, Student, Employee, Faculty, and Staff classes) [20]
// Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee. A Person has a name, address, phone number, and email address. A Student has a class status (First Year, Second Year, Third Year, Final Year). Define the status as a constant. An Employee has an office and salary. A Faculty member has office hours and a rank. A Staff member has a title. Override the toString method in each class to display the class name and the person's name. Draw the UML diagram for the classes and implement them. Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

