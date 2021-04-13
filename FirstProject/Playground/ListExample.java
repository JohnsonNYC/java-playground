package FirstProject.Playground;
import java.util.*;

public class ListExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("I");
    list.add("Love");
    list.add("Java");
    list.add("Language");
    Iterator<String>  iter = list.iterator();
    while(iter.hasNext()){
      System.out.println(iter.next());
    }
  }
}
