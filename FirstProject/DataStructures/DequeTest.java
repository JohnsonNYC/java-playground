package FirstProject.DataStructures;
import java.util.*;
public class DequeTest {
  public static void main(String[] args) {
    // Queue Implemenation with FIFO behavior 
    Queue<String> queue = new ArrayDeque<String>();
    queue.add("Joe");
    queue.add("Jack");
    queue.add("Eva");
    queue.add("Mia");
    queue.add("Luke");

    System.out.println("People in queue - after addition of five people");
    for(String people : queue){
      System.out.println(people);
    }

    // Stack Implemenation with LIFO behavior
    Deque<Integer> stack = new ArrayDeque<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    System.out.println("Numbers in stack - after addition of six values");
    for(Integer val: stack){
      System.out.println(val);
    }

    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println("Numbers in stack - after removal of three values");


    //Methods
    // add
    // offer 
    // remove 
    // poll 
    // element 
    // peek
  }
}
