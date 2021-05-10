import java.util.Stack;

public class BalancedString {
  public static void main(String[] args) {
    // Given an expression string, write a program to examine whether the pairs and
    // the orders of { } ( ) [ ]
    // are correct

    // Input = "[()]{}{[()()]()}”
    // Output: Balanced

    // Input = '[(])'
    // Output: Not Balanced

    String input = "[()]{}{[()()]()}";
    System.out.println(isBalanced(input));
  }

  public static String isBalanced(String input) {
    // iterate rhtough the input
    // for every opening bracket, add ot the stack
    // for every closing bracket, remove and check if it's the counterpart

    // if stack is of size = 0, result is balanced
    // else it isn't

    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
        stack.push(input.charAt(i));
      } else {
        // if close bracket AND last element matches, pop
        if (input.charAt(i) == ')' && stack.peek() == '(') {
          stack.pop();
        }
        if (input.charAt(i) == '}' && stack.peek() == '{') {
          stack.pop();
        }
        if (input.charAt(i) == ']' && stack.peek() == '[') {
          stack.pop();
        }
      }
    }

    if (stack.isEmpty())
      return "Balanced";
    else
      return "Not Balanced";
  }
}
