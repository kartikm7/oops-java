package Static;

public class Static {
  public static void main(String[] args) {
    /* to call a non static method inside a static method, we must either instantiate an object of that parent class. */ 
    Static check = new Static(); // here we instantiate an object of the class inside of the class (mind boggling almost but super cool)
    check.value(10); // now we can access all the parent class methods as we do with any object. 
    check.print(); // likewise here
    
    /* the one below throws an error because we cannot reference a non static variable inside a static variable */
    // print(); 

    /* But, why is it so? It's because static variables are independent of objects so we can't access 
    the instance variables inside of a static class 
     */
  }
  // non static method
  void print(){ 
    System.out.println("Hello there this is a print from a non-static method");
  }
  // non static method
  int value(int val){
    System.out.println(val);
    return val;
  }
}
