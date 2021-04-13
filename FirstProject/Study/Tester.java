package FirstProject.Study;
import java.util.*;

public class Tester {
  public static void main(String[] args){
    String[] words = {"heaven", "hell", "liar", "similar"};
    // 
    // 'heaven'
    // Set => unique characters [h,e,a,v,n]
      // 'liar', liar, similar
      // h, e, l 
    int counter = 0;
    for(int i = 0; i < words.length; i++){ // i = 0 'heaven'
      Set<Character> store = new HashSet<Character>(); // [h, e, a, v, n]
      String currentWord = words[i];
      for(int j = 0; j < currentWord.length(); j++){
        store.add(currentWord.charAt(j));
      }

      for(int k = 0; k < words.length; k++){ // 'hell'
        if( i == k ) continue;
        boolean isPresent = true; 
        for(int l =0; l < words[k].length(); l++){ 
          if(!store.contains(words[k].charAt(l))) isPresent = false;
        }
        if(isPresent == true) counter++;
      }
    }

    if(counter > 0 ) System.out.println(counter);
    else System.out.println(-1);
  }
}
