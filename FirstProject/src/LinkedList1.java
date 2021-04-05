package FirstProject.src;

import java.util.List;
import java.util.LinkedList;

public class LinkedList1 {
  public static void main(String[] args){
    List<Integer> elements = new LinkedList<Integer>();
    elements.add(1);
    elements.add(2);
    elements.add(3);
    elements.add(4);
    elements.add(5);
    elements.add(6);
    elements.remove(1); // Removes element at index 1
    // [1, 3, 4, 5, 6] // After removal
    elements.add(3,34); // Add element at indext 3
    // [1, 3, 4, 34, 5, 6] // After adding
    elements.set(5,15); // update element at index 5 
    //[1, 3, 4, 34, 5, 15] // After update
    System.out.println(elements);
  }
}
