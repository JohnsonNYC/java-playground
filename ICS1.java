import java.nio.charset.CharacterCodingException;
import java.util.Scanner;

public class ICS1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("X: ");
    String x = sc.nextLine();
    System.out.println("Y: ");
    int y = sc.nextInt();

    int result = Integer.parseInt(x);
    for (int i = 0; i < x.length(); i++) {
      result *= Character.getNumericValue(x.charAt(i));
    }

    if (result == y) {
      System.out.println("These are seeded numbers");
    } else {
      System.out.println("These are not seeded numbers!!");
    }
  }
}
