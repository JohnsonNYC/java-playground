package FirstProject.src;

public class Array1 {
  public static int findTotalCount(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    System.out.println(total);
    return total;
  }
}
