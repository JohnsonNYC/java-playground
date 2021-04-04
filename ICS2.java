import java.util.Scanner;

public class ICS2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter your number to check if you number is a lucky number");
    String input = sc.nextLine();

    if (input.length() < 2) {
      System.out.println("Single Digit Numbers are NOT Lucky");
    } else {
      int result = 0;
      for (int i = 1; i < input.length(); i = i + 2) {
        result += Math.pow(Character.getNumericValue(input.charAt(i)), 2);
      }

      if (result % 9 == 0) {
        System.out.println("Input number is a lucky number");
      } else {
        System.out.println("This is not a lucky number");
      }
    }
  }
}
