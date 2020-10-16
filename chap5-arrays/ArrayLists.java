// ARRAY LIST NOTES
// - dynamic arrays, can add/remove elements (not fixed size)

// 1) need to import java.util.ArrayList
import java.util.ArrayList;

class ArrayLists {

  // Main (entry point)
  public static void main(String[] args) {

    // 2) DECLARING ArrayLists
    // - use angle brackets < >
    // - brackets are used for GENERICS = allows us to define classes and objects
    //   as parameters of an ArrayList
    // - can also use: <Double>, <Char>, <String>, ...
    ArrayList<Integer> nums1;

    // 3) cant use primitives
    // ArrayList<int> nums;             // COMPILE ERROR

    // 4) DECLARING, then INITIALIZING ArrayLists
    ArrayList<Integer> nums2;
    nums2 = new ArrayList<Integer>();
    // System.out.println(nums2);       //=> []

    // 5) DECLARING, AND INITIALIZING ArrayLists (one line)
    ArrayList<Integer> nums3 = new ArrayList<Integer>();

    // 6) arrayList.add( val )- ADD METHOD
    // - like JS .push method, adds val to end of array
    // - only takes in 1 arg
    ArrayList<String> nums4 = new ArrayList<String>();
    nums4.add("a");
    nums4.add("b");
    nums4.add("c");
    System.out.println(nums4);          //=> [ "a", "b", "c" ]

    // 7) arrayList.size() = SIZE METHOD
    // - .length method doesnt exist for ArrayLists
    ArrayList<Integer> nums5 = new ArrayList<Integer>();
    nums5.add(3);
    nums5.add(4);
    System.out.println(nums5.size());   //=> 2
    
    // 8) ACCESSING ArrayList elements- GET METHOD
    // - Can't use hard brackets [ ], like for regular arrays
    // - use arrayList.get( idx ) 
    ArrayList<Integer> nums6 = new ArrayList<Integer>();
    nums6.add(1);
    nums6.add(2);
    System.out.println(nums6.get(0));   //=> 1


    // 9) SETTING/Updating ArrayList elements- SET METHOD
    // - Can't use hard brackets [ ] =
    ArrayList<Integer> nums7 = new ArrayList<Integer>();
    nums7.add(1);
    nums7.add(2);
    nums7.set(1, 69);
    System.out.println(nums7);          //=> [ 1, 69 ]

    // 10) REMOVING element- .REMOVE METHOD
    // - arrayList.remove( idx )
    // - returns removed element
    ArrayList<String> nums8 = new ArrayList<String>();
    nums8.add("a");
    nums8.add("b");
    nums8.add("c");
    System.out.println(nums8.remove(2));    //=> "c"
    System.out.println(nums8);              //=> [ a, b ]

    // 11) REMOVING element- .REMOVE METHOD
    // - arrayList.remove( value )
    // - returns FIRST instance of the value
    ArrayList<String> nums9 = new ArrayList<String>();
    nums9.add("a");
    nums9.add("b");
    nums9.add("a");
    System.out.println(nums9.remove("a"));  //=> a
    System.out.println(nums9);              //= [ b, a ]

    // 12) FINDING element- .INDEX OF METHOD
    // - arrayList.indexOf( value )
    // - returns FIRST instance of value
    //   returns -1 if not found
    ArrayList<String> nums10 = new ArrayList<String>();
    nums10.add("apple");
    nums10.add("pear");
    nums10.add("apple");
    System.out.println(nums10.indexOf("apple"));  //=> 0
    System.out.println(nums10.indexOf("mango"));  //=> -1


  }
}
