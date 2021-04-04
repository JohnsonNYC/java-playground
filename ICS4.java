public class ICS4 {
  public static void main(String[] args) {
    // Problem: Get this pattern
    // *****
    // ****
    // ***
    // **
    // *
    String output = "*****";
    int counter = 1;
    while (counter <= 5) {
      System.out.println(output);
      String newOutput = output.substring(0, output.length() - 1);
      output = newOutput;
      counter++;
    }
  }
}
