// LESSON 2 NOTES- VARIABLES
// - PRIMITIVE DATA TYPES:
//    - int     integers. ex. -13, 0, 2
//    - double  doubles.  ex.  1.7 E+ 308 (17 followed by 307 0's) rational nums
//        - can store larger/smaller numbers than int
//    - boolean booleans. ex. true, false
//    - char    characters ex. 'a', 'A', '!'
//        - can only have ONE character ('AA' not allowed)
//        - chars have single quotes ', strings have double quotes "
// - String     strings ex. "hello"
// - variable names must start with valid letter, or $, or a _
// - Must declare the data type when declaring a variable
//   Ex:
//   int year;
//
// OPERATORS:
// - similar to JavaScript
// - integer division = any remainder is lost (num is floored)
//   ex.
//   int uneven = 10 / 4;     //=> 2
// - can't use inequality operator == on strings, must use .equals()
// - use + for string concatenation


// QUESTIONS
// - why does String have to be capitalized (var declaration), but int doesn't?
//    - Bec. String is an object, not a primative data type


public class L2Notes {
  public static void main(String[] args) {
    String name = "Harry";
    int year = 2012;
    double bigNum = 3000.00;
    boolean lookingForJob = true;
    char gender = 'm';
  }
}