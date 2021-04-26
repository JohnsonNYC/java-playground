package FirstProject.Study;
import java.util.*;


public class StringPalindrome {
  public static boolean isPalindrome(String inp) {
    if (inp.length() < 1) {
      return false;
    }
    StringBuilder s = new StringBuilder(inp);

    return (inp.equals(s.reverse().toString()));
  }

  public static void main(String[] args) {
    Map<String, Integer> letters = new HashMap<String, Integer>();
    Set<String> palindromes = new HashSet<>();

    String input = "SROORAB";

    for (int i = 0; i < input.length(); i++) {
      String s = "";
      s += input.charAt(i);

      if (!letters.containsKey(s)) {
        letters.put(s, 1);
      } else {
        int count = letters.get(s);
        count++;
        letters.put(s, count);
      }
    }

    for (Map.Entry<String, Integer> entry : letters.entrySet()) {
      if (entry.getValue() == 1) {
        palindromes.add(entry.getKey());
      }
    }

    for (int i = 0; i < input.length(); i++) {

      // get the indices of the longest substring
      for (int j = input.length(); j >= i; j--) {

        String stringBlock = input.substring(i, j);
        System.out.println("Current: " + stringBlock);
        if (isPalindrome(stringBlock)) {
          palindromes.add(stringBlock);
          i = j;
          break;
        }
      }
    }

    // CURRENT OUTPUT: 00 A B S ROOR
    for (String pal : palindromes) {
      System.out.print(pal + " ");
    }
    System.out.println();
  }
}
