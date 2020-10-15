// LESSON 1 NOTES- INTRO
// - class name must match file name "HelloWorld.java" (case sensitive)
// - Java is a COMPILED language = code is transformed into byte code by a
//   compiler before it is executed. 
// - JavaScript is a INTERPRETED language = no compiler. but code is read
//   and executed by some other program
// - can compile java in mac terminal with  "javac [filename].java"
//    - this creates a .class file in your current directory, which you can 
//      then run with the below command:
// - can run java in mac terminal with      "java [filename]"
//
// 1) Java files must have at least one class AND one main() method
// 
// 2) public static void main(String[] args)
//    - public = allows main to be accessible everywhere (like ruby public methods)
//    - static = ?
//    - void = main method does not return any values
//    - main = name of method
//        - every file/class must have a main method
//        - entry point for app, all other methods are invoked here
//        - accepts a single arg. an array of strings
//        - runs automatically


public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}