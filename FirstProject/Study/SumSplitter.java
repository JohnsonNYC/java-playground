package FirstProject.Study;
import java.util.*;
// input [87,100,68,1,28,67,41,67]
// output 229,230 

//group 1: [87,100,41,1]
//group 2: [28,67,68,67]
public class SumSplitter{
  public static int[] reverseSort(int[] inp){
      int[] results = new int[inp.length];

      Arrays.sort(inp);

      for(int i = results.length-1, j = 0; i >= 0; i--, j++){
          results[j] = inp[i];
      }

      return results;
  }

  //returns the sum of the list
  public static int listSum(List<Integer> list){
      int sum = 0;
      for(Integer i : list){
          sum += i;
      }

      return sum;
  }

  public static void main(String[] args){
      int[] input = {87,100,68,1,28,67,41,67};
      int sum = 0;
      for(int i : input){
          sum += i;
      }
      int median = (int) sum/2;

      int[] sorted = reverseSort(input);

      List<Integer> group1 = new ArrayList<Integer>();
      List<Integer> group2 = new ArrayList<Integer>();

      List<Integer> groupOneIndices = new ArrayList<>();
      //this starts group 1
      for(int i = 0; i < sorted.length; i++){
          int currentSum = listSum(group1);
          if((currentSum + sorted[i]) > median){
              continue;
          }
          
          group1.add(sorted[i]);
          groupOneIndices.add(i);
      }

      for(int i = 0; i < sorted.length; i++){
          if(groupOneIndices.contains(i)){
              continue;
          }
          group2.add(sorted[i]);
      }

      for(Integer i : group1){
          System.out.print(i + " ");
      }
      System.out.println();

      for(Integer i : group2){
          System.out.print(i + " ");
      }
      System.out.println();
  }
}
