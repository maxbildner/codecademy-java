public class Order {

  // Instance attributes/state
  boolean isFilled;
  double billAmount;
  String shipping;
  
  // Constructor method
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  // Instance Methods
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  

  public double calculateShipping() {
	 	// IF, ELSE-IF, ELSE
    // if (shipping == "Regular") {
    //   return 0;

    // } else if (shipping == "Express") {
    //   return 1.75;

    // } else {
    //   return .50;
    // }

    // SWITCH STATE
    double shippingCost;

	 	// declare switch statement here
    switch (shipping) {
      case "Regular":
        shippingCost = 0;

        // BREAK- without break, if match is hit, every case code will also run (regardless if match?)
        break;

      case "Express":
        shippingCost = 1.75;
        break;

      default:
        shippingCost = .50;
    }

    return shippingCost;
 	}
  

  public static void main(String[] args) {
    // do not alter the main method!
    // Order book = new Order(true, 9.99, "Express");
    // Order chemistrySet = new Order(false, 72.50, "Regular");
    
    // book.ship();
    // chemistrySet.ship();

    if (!false && 5 > 4) {
      System.out.println("true");
    }
  }
}

// LOGICAL OPERATIOR
// ||    = OR just like JS
// &&    = AND just like JS
