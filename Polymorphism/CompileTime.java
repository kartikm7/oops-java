package Polymorphism;

public class CompileTime {
  String name;
  int age;

  CompileTime(){
    this.age = -1;
    this.name = "N/A";
  }

  /* Constructor overloading is a type of dynamic/runtime polymorphism
   * As Java during runtime, after the code is converted to bytecode chooses the constructor to call depending on the following:
   * Number of arguments, Data type of arguments, Order of arguments, return type of Constructor, Access modifier (Not too sure yet)
   * This phenomena of choosing a method/constructor during runtime by Java is known as Dynamic method dispatch. 
   */

  CompileTime(String name, int age){
    this.name = name;
    this.age = age;
  }

  /* Similarly, this same concept applies to non-special/user defined methods during method overloading
   * So, this is actually just the same as Constructor overloading because we are "morphing" 
   * the same method in "poly"/mulitple ways.
   * This, is so interesting. 
  */

  void print(){
    System.out.println("This is printing");
  }

  void print(String text){
    System.out.println("This is what you wanted to print: "+text);
  }

  /* The above is known as Late binding, because Java figures it out during runtime.
   * So, it really "binds" the method call to the expected method during method overloading during runtime which is late.
   * It's only late cause there is a process before run-time, i.e compile time and
   * it is possible to early bind to a method/constructor 
  */

  final void printNew(){
    System.out.println("This cannot be overriden");
  }
}
