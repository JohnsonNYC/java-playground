package FirstProject.DataStructures;
import java.util.*;

public class TressSetDemo {
  public static void main(String[] args) {
    Set s = new TreeSet();
    s.add("4");
    //s.add(8);
    Iterator itr = s.iterator();
    // while(itr.hasNext()){
    //   System.out.println(itr.next() + " ");
    // }// Compilation error comparing integer to string

    TreeSet s1 = new TreeSet();
    s1.add("one");
    s1.add("two");
    s1.add("three");
    s1.add("one");

    Iterator it = s1.iterator();
    while(it.hasNext()){
      System.out.println(it.next()+ " ");
    }

  }
}
