package FirstProject.DataStructures;
import java.util.*;

public class ListTest {
  public static void method1(List<Object> list){
    System.out.println(list.size());
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("z");
    ListTest.method1(list);
  }
}
