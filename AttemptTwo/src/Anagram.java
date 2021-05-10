import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("listen", "silent")); // true
    System.out.println(isAnagram("triangle", "integral")); // true
    System.out.println(isAnagram("abc", "bca")); // true
    System.out.println(isAnagram("abc", "bcc")); // false
  }

  public static boolean isAnagram(String input1, String input2) {
    // Convert both strings to char array
    char[] arrStr = input1.toCharArray();
    char[] arrStr2 = input2.toCharArray();
    // Sort both char arrays
    Arrays.sort(arrStr);
    Arrays.sort(arrStr2);

    return Arrays.equals(arrStr, arrStr2);
  }
}
