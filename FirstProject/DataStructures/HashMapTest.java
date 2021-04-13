package FirstProject.DataStructures;
import java.util.*;
public class HashMapTest {
  public static void main(String[] args) {
    //Methods
    // put(Object key, Object value)
    // remove(Object key)
    // get(Object key)
    // replace(K key, V oldValue, V newValue)
    // clear()
    // size()
    // isEmpty()

    Map<String,Integer> books = new HashMap<String,Integer>();
    books.put("Data Structure", 50);
    books.put("Operating SYstem", 80);
    books.put("Let Us C", 70);
    books.put("Java Fundamentals", 40);

    //System.out.println(books);

    //Traversing the map
    //for(Map.Entry<String,Integer> book: books.entrySet()){
      //System.out.println(book.getKey()+ ", " + book.getValue());
    //}
    //
    // OR
    // 
    for(String key: books.keySet()){
      System.out.println("Key: " + key + " Value: " + books.get(key));
    }
  }
}
