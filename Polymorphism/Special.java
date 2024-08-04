package Polymorphism;

public class Special {
  /* What happens when we try to override a static method? */
  static void print(){
    System.out.println("This is in special");
  }
}

class Case extends Special{
  /* Why does this not work as intended?
   * Because, @Override annotation is used with respect to objects rather than classes.
   * and "static" methods are independent of objects which means the @Override annotation will not work
   * Infact, the "static" methods are meant to be accessed only by referencing the class directly and
   * not by "Overriding" since "Overriding" methods is with respect to Objects rather than classes.
   * So inshort, "Overriding" methods is with respect to objects and "static" methods are independent of objects
   * hence, you cannot override a static method 
   */ 
  @Override
  static void print(){
    System.out.println("This will throw an error");
  }
}