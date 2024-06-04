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
  void show(){
      System.out.println("Method C");
  }
}

public class MultipleInheritance {
  public static void main(String[] args) {

      C c = new C();
      c.show();
      
  }
}

//solution for multiple inheritance is through interfaces, example question in interface file