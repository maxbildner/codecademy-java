public class StringMethods {

  // MAIN- Entry point 
  public static void main(String[] args) {

    // 1) string.length()           LENGTH METHOD
    // - no args
    // - returns length of string
    String tweet = "yo";
    System.out.println(tweet.length());     //=> 2

    // 2) string1.concat(string2)   CONCAT METHOD
    // - returns new string where string2 is added to string1
    String str1 = "yes";
    String str2 = "no";
    System.out.println(str1.concat(str2));  //=> "yesno"
    System.out.println(str1);               //=> "yes"
    System.out.println(str2);               //=> "no"
    
    // 3) string.equals(string2)    EQUALS METHOD
    // - returns boolean, compares values not memory
    String str3 = "yes";
    String str4 = "yes";
    System.out.println(str3.equals(str4));  //=> true

    // 4) string.indexOf( str )     INDEX OF METHOD
    // - takes in string
    // - returns index position of first occurance of input string
    //   returns -1 if not found
    String str5 = "apple";
    System.out.println(str5.indexOf("pp"));  //=> 1

    // 5) string.charAt( idx )      CHAR AT METHOD
    // - takes in index
    // - returns character locatred at index
    // - runtime error if index out of bounds
    String str6 = "abc";
    System.out.println(str6.charAt(2));     //=> c
    // System.out.println(str6.charAt(5));  //=> RUNTIME ERROR

    // 6) string.substring( startIdx, endIdx )  SUBSTRING METHOD
    // - very similar to JS string.slice() method
    // - inclusive of startIdx, exclusive of endIdx (like JS)
    // - returns new string
    String str7 = "abc";
    System.out.println(str7.substring(0));    //=> "abc"
    System.out.println(str7.substring(0,2));  //=> "ab"
  
    // 7) string.toLowerCase()    
    // - returns new string all lowercase

    // 8) string.toUpperCase()
    // - returns new string all uppercase
  }
}