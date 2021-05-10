public class StringReverse {
  public static void main(String[] args) {
    String input = "Johnson";
    System.out.println(reverseString(input));
  }

  public static StringBuilder reverseString(String input) {
    StringBuilder result = new StringBuilder(input);
    return result.reverse();
  }
}
