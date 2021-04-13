package FirstProject.Assignment2;

public class ICS4 {
  // Implement a program to check whether a given number is an Armstrong number
  // 371 
  // 3 ^ 3 + 7^3 + 1^3 = 371
  // therefore 371 is an armstrong number;

  public static void main(String[] args) {
    String number = "1634";
    int result = 0;

    for(int i = 0 ; i < number.length(); i++){
      int num = Character.getNumericValue(number.charAt(i));
      result += Math.pow(num, number.length());
    }
    if(Integer.toString(result).equals(number)){
      System.out.println(number + " is an Armstrong number");
    }else{
      System.out.println(number + " is not an Armstrong number");
    }
  }
}
