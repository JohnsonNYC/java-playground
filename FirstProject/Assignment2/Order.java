package FirstProject.Assignment2;

public class Order {
  // Create a new class Order in Java SwiftFood;
  // Instance Variables
  // orderId Int
  // orderedFoods: String
  // totalPrice: double 
  // status: String;

  // Methods
  // calculateTotalPrice(int unitPrice): double; 
    // Calculate the total price by applying a service charge of 5% on the food item ordered
    // and store it in the totalPrice instance variable.
    // return the total price
  public int orderid;
  public String orderedFoods;
  public double totalPrice; 
  public String status;

  public double calculateTotalPrice(int unitPrice){
    this.totalPrice = unitPrice + (unitPrice * 0.05);
    return totalPrice;
  }

  public static void main(String[] args) {
    Order order = new Order();
    order.calculateTotalPrice(34);
    System.out.println(order.totalPrice);
  }
}
