package FirstProject.DataStructures;
import java.util.*;
public class HashSetTest {
  public static void main(String[] args) {

    //METHODS 
    // add()
    // iterator 
    // size
    //isEmpty()
    // contains(Object o)
    // remove(Object o)
    // clear()
    // A HashSet is a collection of items where every item is unique
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Volvo");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("BMW");
    //System.out.println(cars); // Returns in random order
    

    Set<String> cars2 = new LinkedHashSet<String>();
    cars2.add("BMW");
    cars2.add("Volvo");
    cars2.add("Ford");
    cars2.add("Mazda");
    cars2.add("BMW");

    //System.out.println(cars2); // Returns in the order that they are inserted

    Set<String> cars3 = new TreeSet<String>();
    cars3.add("BMW");
    cars3.add("Volvo");
    cars3.add("Ford");
    cars3.add("Mazda");
    cars3.add("BMW");
    System.out.println(cars3); // Returns in a sorted Order 
  }
}
