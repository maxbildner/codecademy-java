// LESSON 5 NOTES- INHERITANCE AND POLYMORPHISM
// 1) extends
//    -  just like JS, used to make a class a child of a parent
//    [childClassName] extends [parentClassName] { }
//    - child inherits all of parent instance variables/methods
//    - also possible to overide parents constructor by rewriting childs 
//      constructor

// 2) only need one main method, but you must run java app from that file
//    with the main() method

// 3) super( arg )
//    - just like JS/Ruby, passes in arg into parent constructor, when new
//      object is instantiated
 
// 4) private keyword
//    - even child cant access parents attributes/methods if private keyword used
//    - can place before attribute (or method?) name
  
// 5) protected keyword
//    - allows child to acces parent attribute/method, but prevents non-child
//      from accessing parent attribute/method
//    - can place before attribute (or method?) name

// 6) final keyword
//    - add infront of method/attribute name, so that method/attribute
//      can't be over-ridden by any child

// 7) POLYMORPHISM
//    - allows a child class to share the information and behavior of its parent 
//    - class while also incorporating its own functionality.
//    - ex. operator +  can be used for both doubles and ints
//    - ex. using a child class as its parent class
//      instantiate a child object as a member of the parent class
//      BankAccount moseysAccount = new CheckingAccount(600.00);


// 8) Method Overriding
//    - use keyword "@Override"
//    - overrides parent method in child method


public class Shape {
  
}