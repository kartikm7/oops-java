package Static;

import java.util.Date;

public class Sales {
  String client; // client name
  static int number; // to count the sales
  static Date date; // 

  static { // this block only runs once
    date = new Date();
    number++;
  }

  // Defining the constructor

  Sales(String client){
    this.client = client;
    // the static variable could be updated whenever there's a new object created aswell
    date = new Date(); 
  }

  void print() {
    System.out.println(date);
  }
}

class Main {
  public static void main(String[] args) {
    Sales first = new Sales("Pogo");
    System.out.println("Client name: "+ first.client + "\n Date: " + Sales.date);
  }
}