package FirstProject.DataStructures;
import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(5);
    list1.add(10);
    list1.add(50);
    list1.add(15);
    list1.add(20);
    list1.add(1);
    //System.out.println(list1);

    Collections.sort(list1);
    //System.out.println(list1); //[1, 1, 5, 10, 15, 20, 50]

    Collections.reverse(list1);
    //System.out.println(list1); //[50, 20, 15, 10, 5, 1, 1]

    Integer max = Collections.max(list1);
    //System.out.println(max); // 50

    Integer min = Collections.min(list1);
    //System.out.println(min); //1

    Integer freq = Collections.frequency(list1, 1);// Finding the frequency of an element 
    //System.out.println(freq); //2 becuse there are two values of 1 inside the array list

    Collections.swap(list1,1,3); // Swapping two elements in a collection
    //System.out.println(list1);//[50, 10, 15, 20, 5, 1, 1] swapped index 1 and 3

    Collections.shuffle(list1); // Shuffle the elements in a collection 
    //System.out.println(list1); 

    List l = new ArrayList(); // No generics so you can add diff datatypes
    l.add("Pasta");
    l.add(12);
    l.add('A');
    
    List<Object> l1 = new ArrayList<Object>();
    for(Iterator iterator = l.iterator(); iterator.hasNext();){ // iterate through l
      l1.add(iterator.next());// add all elements from l to l1
    }
    //System.out.println(l1);

    List arrlist = new ArrayList();
    arrlist.add("A");
    arrlist.add("A");
    arrlist.add("E");
    arrlist.add("I");
    arrlist.add("O");
    arrlist.add("U");
    // A A E I O U
    // 0 1 2 3 4 5
    // O U A A E I 0
    Collections.rotate(arrlist,8); // index of all components added by distanct '8' for new position
    System.out.println(arrlist);
  }
}
