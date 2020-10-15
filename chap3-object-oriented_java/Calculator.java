public class Calculator {

  // Constructor
  // - not required
  public Calculator() {

  }

  // Instance methods
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }


  // Main (entry point)
  // static = class method (don't need instance of obj to run method)
  public static void main(String[] args) {

    // create instance of Calculator object, called myCalculator
    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));

  }
}