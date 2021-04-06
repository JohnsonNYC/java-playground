package FirstProject.Assignment1;
import java.util.Scanner;

public class DataTypes2 {
  // Implment a program to convert temperature from Fahrenheit to Cel
  // C = ((f-32)/90) * 5;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
  
    float cel = ((input - 32)/9)*5;
    System.out.println(cel);  
  }
}
