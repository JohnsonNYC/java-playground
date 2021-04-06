package FirstProject.Assignment1;
import java.util.Scanner;
public class DataTypes1 {
  // Implement a program to find the area of a circle 
  // by using the formula given below and display the calculated
  // area. 
  // Area = pi * radius * radius;
  public static void main(String[] args){
    final float pi = 3.14f;
    System.out.println("Please enter the radius of your circle");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    System.out.println("The area of your circle is: "+pi * Math.round(Math.pow(input, 2)*100.0)/100.0);
  }
}
