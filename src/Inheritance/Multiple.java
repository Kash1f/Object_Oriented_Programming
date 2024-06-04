package Inheritance;

class A{
  void show(){
      System.out.println("Method A");
  }
}

class B extends A{
  void show(){
      System.out.println("Method B");
  }
}

//class C is indirectly accessing class A
class C extends B{
  void run(){
      System.out.println("Method C");
  }
}



public class Multiple {

  public static void main(String[] args) {

      C obj = new C();
      obj.show();
      
  }
}