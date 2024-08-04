package Singleton;


/* the purpose of a Singleton class is to only have one object that all the other references point to
   meaning only one object is ever instantiated */ 
public class Singleton {
  String name;
  /* we create a reference variable of type singleton we will use this as the sole object that's instantiated
   * this is static because if it's not static then it depends on the parent class, there has to be an object instantiated
   * for it to be accessed, but making it static makes it object independent so we do not need to instantiate an object
   * we also keep the instance private
   */
  private static Singleton instance;

  /* so how we go about making this singleton is by make the constructor private, 
   * we do this to not allow objects to be instantiated */ 
  private Singleton(){}
    
  /* we create a helper function, to get the above declared instance 
   * now the cool part really is that we keep the method static so that we can reference it directly from class name
   * that helps us get the single instatianted (if not then we instantiated) instance of the class / the object 
  */
  public static Singleton getInstance(){ 
    // incase the instance is not instantiated, we instantiated the object but this only occurs once
    if(instance == null) instance = new Singleton();

    return instance; // we return the insance
  }
}
