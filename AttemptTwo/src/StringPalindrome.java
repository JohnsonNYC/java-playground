import java.util.*;

public class StringPalindrome {
  public static void main(String[] args) {
    minPalindromicSubStrings("SROORAB");
  }

  public static void minPalindromicSubStrings(String str) {

    String output = "";
    List<String> myList = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      for (int j = str.length(); j >= i; j--) {

        output = str.substring(i, j); // substring includes i index but not j so that is why j starts at length and
                                      // stops at <=i

        if (isPalindrome(output)) {

          myList.add(output);
          i = (j - 1); // j-1 bc it isn't inclusive in substring method so in loop it goes from
                       // .length(). dont want array index out of bounds

          break;
        }

      }
    }

    for (String s : myList) {
      System.out.println(s);
    }

  }

  public static boolean isPalindrome(String str) {

    Stack<Character> myStack = new Stack<Character>();
    String rev = "";

    for (int i = 0; i < str.length(); i++) {
      myStack.push(str.charAt(i));
    }

    while (!myStack.isEmpty()) {
      rev += myStack.pop();
    }

    if (rev.equals(str)) {
      return true;

    }

    return false;
  }

}
