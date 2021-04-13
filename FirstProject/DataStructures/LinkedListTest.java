package FirstProject.DataStructures;
import java.util.*;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<String>();
    names.add("Johnson");
    names.add("Rosario");
    names.add("Luis");

    // Iterating through LinkedList;
    Iterator<String> name = names.iterator();
    // while(name.hasNext()){
    //   System.out.println(name.next()); // Print out first item
    // }
    names.set(0, "Paulo");

    
    // Methods 
    // addFirst()
    // addLast()
    // removeFirst()
    //removeLast()
    // getFirst()
    // getLast()
    // ArrayList v LinkedList
    // Both have the same methods as the both implement the List interface

    // When to use Array List
    // You want to access random items frequently 
    // You only to add or remove elements at the end of the list

    // When to use LinkedList
    // Only use the list by looping through it 
    // Frequently needing to add and remove items from the beginning, middle, or end of the list
  }
}
