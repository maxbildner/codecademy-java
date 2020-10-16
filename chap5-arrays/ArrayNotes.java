// ARRAY NOTES
// - holds FIXED number of values of ONE type
// - can hold doubles, ints, booleans, objects, ...
// - indexing begins at 0

// 1) Importing Arrays
//    - Arrays package has helper methods like .toString() that prints arrays
//    - write this at the top of your file (outside class)
//    - don't need this to create general arrays
import java.util.Arrays;

public class ArrayNotes {

  // Main (entry point)
  public static void main(String[] args) {        // can pass in arguments when you run file in terminal

    // 2) Creating an array (declaration/initialization in one line)
    //    - create an array of integers, called nums1:
    int[] nums1 = { 1, 1, 2, 3, 5 };

    // 3) Declaring an Array, then initializing with "new"
    //    - cant declare, then initialize with { }
    int[] arr;
    arr = new int[3];

    // 4) Creating an empty array, and itializing it with fixed size
    //    - create an array of Strings called pets, with a size limit of 3
    //    - once you do this, you cannot change the size!!
    //    - values are initialized with NULL!!!
    String[] pets = new String[3];
    System.out.println(pets[0]);               //=> null

    // 5) Arrays.toString() method
    //    - prints array values
    //    - need to import java.util.Arrays for this to work
    int[] nums2 = { 1, 2, 3 };
    Arrays.toString(nums2);                      //=> [1, 1, 2, 3, 5]
    
    // 6) Accessing Values in arrays
    //    - use square brackets [ index ], just like JS
    double[] prices = { 1.0, 1.5, 2.0 };
    System.out.println(prices[0]);              //=> 1.0
    
    // 7) Populating values in an array
    //    - once array has been declared with size, you can populate values
    String[] fruits = new String[3];
    fruits[0] = "mango";

    // 8) array.length property
    //    - built in instance field/attribute/state of arrays (like JS)
    int[] nums3 = { 1, 1, 1 };
    System.out.println(nums3.length);          //=> 3
    


    // COMMON ERRORS:
    // 1) Can't Delcare an array, then on new line initialize it with { }
    // int[] numsError1;
    // numsError1 = { 1, 2, 3 };                   //=> COMPILE ERROR
    
    // 2) Cant repopulate/initialize
    // int[] numsError2 = { 1, 2 };
    // numsError2 = { 3, 4 };                      //=> COMPILE ERROR
    
    // 3) Can't redeclare variable with same name!
    // int[] numsError3 = { 1, 2 };                    
    // int[] numsError3 = { 3, 4 };                //=> COMPILE ERROR
    
    // 4) Can't populate value outside of array size!
    // int[] numsError4 = new int[2]
    // numsError4[3] = 6;                          //=> RUNTIME ERROR- out of bounds


  }
}