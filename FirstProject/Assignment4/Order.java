package FirstProject.Assignment4;

public class Order {
  private static int orderIdCounter;
  private int orderId;
  
  static{
    orderIdCounter = 1000;
  }

  Order(){
    this.orderId = ++orderIdCounter;
  }

  public void displayInfo(){
    System.out.println("Order ID: " + orderId + " " + "Counter: " + orderIdCounter);
  }
}
