public class Loops {

  // MAIN- Entry Point
  public static void main(String[] args) {
    
    // 1) WHILE LOOP (just like JS)
    // - Ex. print "potato" 3 times
    int i = 0;
    while (i < 3) {
      System.out.println("potato");
      i++;
    }

    // 2) FOR LOOP (just like JS)
    // - Ex. print mango 3 times
    for (int j = 0; j < 3; j++) {
      System.out.println("mango");
    }

    // 3) FOR EACH LOOP
    // - similar to JS for ... in ... 
    // - loop through array and print each letter out
    String[] letters = { "a", "b", "c" };
    for (String letter : letters) {
      // - we can name "letter" anything just like in JS
      System.out.println(letter);
    }

    
  }
}