package Packages;

public class Person {
  String name;
  Techstack stack;

  Person(String name, String acronym) {
    this.name = name;
    stack = new Techstack(acronym);
  }

  public static void main(String[] args) {
    Person p = new Person("Kartikeya", "FFRP");
    System.out.println(p.stack.acronym);
  }

}