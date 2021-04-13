package FirstProject.DataStructures;

//import java.util.ArrayList; // Must import ArrayList interface
//import java.util.List; // Must import interface
import java.util.*;

public class ArrayListTest {
  // Array List impleents the List interface
  // Lists allows duplicates 
  public static void main(String[] args) {

    ListTest <String> orders = new ArrayList<String>();
    orders.add("tortilla");
    orders.add("sandwhich");
    orders.add("fried rice");
    orders.add("pasta");
    orders.add("burger");
    orders.add("pizza");
    orders.add("pasta");
    orders.add("burger");

    if(orders.isEmpty()){ // Check wether order contains any items
      System.out.println("No orders available");
    }

    System.out.println("No Of Order: " + orders.size()); // Display number of orders

    ListTest<String> newOrders = new ArrayList<String>();
    newOrders.add("Tortilla");
    newOrders.add("Cutlet");
    newOrders.add("Fried Egg");

    orders.addAll(newOrders); // Adding new orders to existing orders

    orders.remove("burger"); // Removing burgers from the orders item

    orders.remove(0); // Removing first item from the orders

    // Display all orders
    System.out.println("The items available in the order are: ");
    System.out.println("========================================");
    for(String order : orders){
      System.out.println(order);
    }
    System.out.println("========================================");

    if(orders.contains("pasta")){ // Checking to see if pasta i s ordered or not 
      System.out.println("Pasta is ordered already!!!");
    }else{
      System.out.println("No Pasta ordered");
    }


    Object[] ordersArray = orders.toArray();// Converting List to Array
    orders.clear(); // Deleting all the items from the orders
    System.out.println(orders.isEmpty());

    //Methods
    // add
    // addAll
    // clear
    // contains
    // get
    //indexOf
    // isEmpty
    // lastIndexOf
    // remove
    // set 
    // size
  }
}
