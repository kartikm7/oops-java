package Singleton;
public class Main {
  public static void main(String[] args) {
    Singleton a = Singleton.getInstance();
    Singleton b = Singleton.getInstance();
    a.name = "Kartikeya";
    b.name = "Kartikeya Mishra";
    System.out.println(a.name); // prints Kartikeya Mishra because both a and b point to the same object!
  }
}
