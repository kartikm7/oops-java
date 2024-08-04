package Constructor; // this allows to import the package BLEW MY FUCKING MIND
import java.util.Arrays;

class Constructor {
  public static void main(String[] args) { // String[] args is only used to take in an input from libraries like Scanner in console applications
    TechStack kartik = new TechStack();
    System.out.println(kartik.acronym);
    System.out.println(Arrays.toString(kartik.stack));
  }
}

class TechStack{
  String acronym;
  String[] stack = new String[5];

  TechStack(){
    // this keyword is used to access the instance variables of a class within a constructor of that class 
    this.acronym = "Hello There";
    this.stack = new String[]{"React", "Node.js", "Flask", "Firebase"};
  }
}
