public class Droid {

  // Instance fields/state (analagous to attributes/properties in JavaScript)
  // must define them outside constructor (not inside constructor)
  String name;
  int batteryLevel;


  // constructor method
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }


  // Instance Methods (behavior)
  public void performTask(String task) {
    // System.out.println(this.name + " is performing task: " + task);
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }


  public String toString() {
    // return "Hello my name is " + this.name;    // this works too
    return "Hello my name is " + name;
  }


  // Main (entry point)
  // static = class method (don't need instance of obj to run method)
  public static void main(String[] args) {

    // create instance of droid, named codey
    Droid codey = new Droid("codey");

    // print memory location of codey droid obj
    // System.out.println(codey);             //=> Droid@4dc63996

    // print out droid name
    System.out.println(codey.toString());     //=> "Hello my name is codey"

    codey.performTask("dance");               //=> codey is performing task: dance

    System.out.println(codey.batteryLevel);   //=> 90
  }
}