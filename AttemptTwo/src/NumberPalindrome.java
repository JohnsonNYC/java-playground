import java.util.*;

public class NumberPalindrome {
  // Consider a string 'instr' containing only digits. Traversing from left to
  // right,
  // identify and pring the longest subtstrings(s) of instr which are palindromes
  // without a leading zero(s) and with a minimum length of 2
  public static boolean isPalindrome(String inp){
    //palindrome must have length of at least 2
    if(inp.length() < 2){
        return false;
    }
    //palindrome must not have leading 0s
    if(inp.charAt(0) == '0'){
        return false;
    }

    StringBuilder s = new StringBuilder(inp);

    return(inp.equals(s.reverse().toString()));
}

public static void main(String[] args){
    String input = "30696965456";
    Set<String> palindromes = new HashSet<String>();
    int lengthOfBiggestPalindrome = 0;

    //i is the start of the substring; j is the end
    for(int i = 0; i < input.length(); i++){
        for(int j = input.length(); j >= i; j--){
            //get the current substring
            String current = input.substring(i,j);

            //add the current substring to palindromes if it's a (rule-following) palindrome
            if(isPalindrome(current)){
                palindromes.add(current);
                if(current.length() > lengthOfBiggestPalindrome){
                    lengthOfBiggestPalindrome = current.length();
                }
            }
        }
    }

    //set containing the biggest palindrome substring(s)
    Set<String> biggestPalindromes = new HashSet<String>();

    for(String pal : palindromes){
        if(pal.length() == lengthOfBiggestPalindrome){
            biggestPalindromes.add(pal);
        }
    }

    System.out.println(biggestPalindromes);
}
}
