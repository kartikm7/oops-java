package Polymorphism;

public class Runtime {
  String motherName;
  String fatherName;

  Runtime(String motherName, String fatherName){
    this.motherName = motherName;
    this.fatherName = fatherName;
  }

  
  /* We spoke about, late binding in the CompileTime.java so what is early binding?
  Early binding, is possible through the help of the final keyword. */
  
  final void print(){
    System.out.println("This cannot be overriden");
  }

  void info(){
    System.out.println("This is from Parent Class");
  }
}

class Child extends Runtime{
  String childName;
  public static final String YELLOW = "\033[0;33m";  // YELLOW
  public static final String RESET = "\033[0m";  // Text Reset

  Child(String motherName, String fatherName,String childName){
    super(motherName, fatherName);
    this.childName = childName;
  }

  /* Here we can override, because the method is not final in other words can be morphed/represented in multiple ways. */
  @Override
  void info(){
    System.out.println(YELLOW+"This is from the Child Class"+RESET);
  }

  void info(String text){
    System.out.println("This is what you asked to be printed: "+YELLOW+text+RESET);
  }

  /* But if we try to do the same with the print method from the super class/parent class then what happens?
   * then we get an error, because it's final it cannot be morphed into being represented differently. Rather,
   * it should be accessed as is inherited. This phenomena is called early binding because at compile time the method binding is resolved.
   * Since, a "final" method cannot be overriden. This helps speed up times during runtime, because there is no Dynamic runtime dispatch process occuring/happening
   * during runtime.
   */

  /*
   // Cannot override the final method from RuntimeJava(67109265)
   // void Polymorphism.Child.print()
   @Override
   void print(){
    System.out.println("This will not work");
   }
  */ 

  public static void main(String[] args) {
    Child child = new Child("Vandana Mishra", "Vijaykumar Mishra", "Kartikeya Mishra");
    child.info("OOPS is really fun");
  }
}