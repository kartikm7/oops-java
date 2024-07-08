package Basic;
class Basic{
  public static void main(String[] args){
    TechStack kartik; // declaration
    // kartik is the reference variable
    kartik = new TechStack(); // instatiation
    kartik.acronym = "FFRP"; // here acronym is the instance variable of the class TechStack
    System.out.println(kartik.acronym);
  }
}

class TechStack{
  String acronym;
  String[] stack = new String[5];
}