package Wrapper;

/* Wrapper classes are "wrappers" around primitive data types which usually provide additional functionality.
 * Examples like Integer instead of int, has various underlying methods like valueOf, toString and many others.
*/

class Laptop{
  String name;
  Laptop(String name){
    this.name = name;
  }
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Object is destroyed");
  }
}

public class Wrapper {
  public static void main(String[] args) {
    Laptop a;
    for (int i = 0; i < 1000000; i++) {
      a = new Laptop("Legion");
    }
    // a = new Laptop("Legion"); // 
  }
}
