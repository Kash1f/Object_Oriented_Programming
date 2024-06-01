package Lesson1;

public class Introduction{

public static void main(String[] args) {

        //store 5 rnos:

        int[] numbers = new int[5];

        //store 5 names

        String[] names = new String[5];

         //Store data of 5 students.. How?

         int[] rno = new int[5];
         String[] name = new String[5];
         float[] marks = new float[5];

         //All of this can be done in a single line using classes and objects
         //Class is a named group of properties and functions
         //rno, name and marks are different properties, all of these can be combined into one single entity i.e a class

         //Your own datatype, here Student will be our own data type
         //every single element in this array should contain all 3 things
         Student[] students = new Student[5];

         Student kashif;

       
}

}

//create a class 
//for every single student

class Student{
        int rno;
        String name;
        float marks;

        Student(){
                this.rno= 15;
                this.name= "Kashif Ahmed";
                this.marks= 99;
        }
}