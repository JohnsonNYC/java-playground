package FirstProject.Assignment2;
import java.util.Scanner;
public class ICS2 {
  public static void main(String[] args) {
    // Implement a program to check whether a given number is a palindrome
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String comparable = "";
    for(int i = input.length() - 1; i >= 0; i--){
      char number = input.charAt(i);
      comparable += number;
    }

    if(input.equals(comparable)){
      System.out.println(input + " is a palindrome");
    }else{
      System.out.println(input + " is not a palindrome");
    }
  }
}
