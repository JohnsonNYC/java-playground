package FirstProject.Playground;
import java.util.*;

public class Practice1 {
  // Find Duplicates in a string 
  public static void main(String[] args) {
    String input = "Health";
    Set<Character> store = new HashSet<Character>();
    for(int i = 0; i < input.length(); i++){
      store.add(input.charAt(i));
    }

    if(input.length() == store.size()){
      System.out.println("There ARE NO duplicates in string");
    }else{
      System.out.println("There ARE duplicates in string");
    }
  }


}
