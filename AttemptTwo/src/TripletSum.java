import java.util.*;

public class TripletSum {
  // Consider a non-zero positive integer 'innum' and a non-empty array inarr containing non-zero
  // unique positive integers. Print the number of unique triplets outnum that can be identified
  // from 'inaar' such that the sum of integers in the triplets is equal to innum. 
  // If no such triplets can be identified, print -1
  public static int[] stringToInts(String inp){
    String[] splitup = inp.split(",");
    int[] results = new int[splitup.length];

    for(int i = 0; i < results.length; i++){
        results[i] = Integer.parseInt(splitup[i]);
    }

    return results;
}

public static int tripletCounter(int[] inarr, int innum){
    Set<Integer> usedNums = new HashSet<Integer>();
    //int count = 0;

    for(int i = 0; i < inarr.length; i++){
        for(int j = 0; j < inarr.length; j++){
            if(i == j) continue;
            for(int k = 0; k < inarr.length; k++){
                if((i == k) || (j == k)) continue;

                if((inarr[i] + inarr[j] + inarr[k]) == innum){
                    usedNums.add(inarr[i]);
                    usedNums.add(inarr[j]);
                    usedNums.add(inarr[k]);
                }
            }
        }
    }

    if(usedNums.isEmpty()){
        return -1;
    }

    return (int) (usedNums.size()/3);
}

public static void main(String[] args){

    String testString = "1,4,6,54,32,65,31";
    int innum = 100;
    int[] nums = stringToInts(testString);

    System.out.println(tripletCounter(nums, innum));
}
}
