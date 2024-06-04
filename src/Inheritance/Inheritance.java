package Inheritance;



class parentClass{
    
    int age;
    String color;
    int roll_no;

    void initObj(int a, String c, int r){
        age =  a;
        color = c;
        roll_no = r;
    }

        void display(){
            System.out.println(age + " " + color + " " + roll_no);
        }
    }


class childClass extends parentClass{
    
   
    void initObj(int a, String c, int r){
        age =  a;
        color = c;
        roll_no = r;
    }

    void show(){
        System.out.println(age + " " + color + " " + roll_no);
    }
    
}
public class Inheritance{
    public static void main(String[] args) {

        parentClass parent1 = new parentClass();
        parent1.initObj(20, "black", 30);
        parent1.display();


        childClass child1 = new childClass();
        child1.initObj(10, "white", 40);
        // child1.display();
        // child1.initObject(200, "street abc", 666666);
        child1.show(); 

         
    }
}

//This is single inheritance, here childClass inherits parentClass and the object of childClass can use the methods of parentClass, as we can see the output is "Parent class" and "Child class" respectively
