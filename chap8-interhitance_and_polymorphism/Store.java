// LESSON 3 NOTES- Object Oriented Java- instance variables and instance methods
// 1) public static void main(String[] args)
//    - public = allows main to be accessible everywhere (like ruby public methods)
//    - static = ?
//    - void = main method does not return any values
//    - main = name of method
//        - every file/class must have a main method
//        - entry point for app, all other methods are invoked here
//        - accepts a single arg. an array of strings
//        - runs automatically
//
// 2) CONSTRUCTOR method:  public [class name]()
//    - like the constructor method in JavaScript
//    - only gets executed when an instance of the class object is created
//    - params must be in constructor if passed in when instance created
//      not like JS where extra args are ignored!!
//
// 3) creating an instance of an object
//    Ex.
//    Store lemonadeStore = new Store();
//
// 4) printing an object to console shows objects location in computer memory
//    Ex.
//    System.out.println(lemonadeStore);    //=> Store@6bc7c054
//
// 5) INSTANCE VARIABLE (attributes/properties of obj) must be 
//    declared outside constructor method!! inside class (anywhere, usually top)
//    - assignment of instance variables inside constructor!!
//    - these vars represent state (properties) and behavior (instance methods)
//
// 6) accessing attributes/properties (use dot . operator just like in JS)
//
// 7) Instance methods
//    - don't have to be declared outside of constructor like attributes?
//
// 8) SCOPE
//    - can't access instance fields (attributes/props) in main function
//    - can access instance fields in methods
//    - variables exist in the scope they were declared in
//   

// QUESTIONS
//  - what is "static" in "public static void main()"?
//  - does public static void main() always take in a string as an arg?
//  - is there a concept of "this" in Java like in JS?
//  - does returning void mean returning null or undefined?


public class Store {
  // instance fields (analagous to attributes/properties in JavaScript)
  String productType;
  int inventoryCount;
  double inventoryPrice;

  // constructor method
  public Store(String product, int count, double price) {   // can't name args same name as attribute fields (unlike in JS)
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }

  // main method
  public static void main(String[] args) {
    // public = allows main to be accessible everywhere (like ruby public methods)
    // static = ?
    // void = main method does not return any values
    Store lemonadeStand = new Store("lemonade", 42, .99); 
    Store cookieShop = new Store("cookies", 12, 3.75);

    System.out.println(
        "Our first shop sells " + lemonadeStand.productType + 
        " at " + lemonadeStand.inventoryPrice + " per unit.");

    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}