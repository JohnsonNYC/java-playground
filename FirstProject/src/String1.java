package FirstProject.src;

import java.util.HashMap;

public class String1{
  public static void main(String[] args){
    // Complete the findHighesteOccurence() method in the Tester 
    // Find the count of the highest occurring character in the string passed to the
    // method and return the count 

    findHighestOccurrence("The angry fox went to the mall");
  }

  public static int findHighestOccurrence(String str){
    // Create a hash 
    // If element is inside already, increase value by one
    // if element is not inside, create key and vale should be one

    HashMap<Character, Integer> countingCharacters = new HashMap<Character, Integer>();

    for(int i = 0; i < str.length(); i++){
      char letter = str.charAt(i);
      if(countingCharacters.get(letter) == null){
        countingCharacters.put(letter, 1);
      }else{
        countingCharacters.put(letter, countingCharacters.get(letter) + 1);
      }
    }

    Integer result = 0;
    //Iterate through Hashmap;
    for(Integer i : countingCharacters.values()){
      result = Math.max(result, i);
    }

    System.out.println(result);
    return result;
  }
}