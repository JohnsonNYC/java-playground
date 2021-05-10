import java.util.*;

public class UniqueCharactersInArray {
  // Given an array of strings, check if word A contains unique characters from B.
  // Doesnt
  // need to work vice versa

  public static void main(String[] args) {
    String[] words = { "heaven", "hell", "liar", "similar" };

    int counter = 0;
    for (int i = 0; i < words.length; i++) {
      Set<Character> store = new HashSet<Character>();
      String currentWord = words[i];
      for (int j = 0; j < currentWord.length(); j++) {
        store.add(currentWord.charAt(j));
      }

      for (int k = 0; k < words.length; k++) {
        if (i == k)
          continue;
        boolean isPresent = true;
        for (int l = 0; l < words[k].length(); l++) {
          if (!store.contains(words[k].charAt(l)))
            isPresent = false;
        }
        if (isPresent == true)
          counter++;
      }
    }

    if (counter > 0)
      System.out.println(counter);
    else
      System.out.println(-1);
  }
}
