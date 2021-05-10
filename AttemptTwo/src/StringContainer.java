public class StringContainer {
  public static void main(String[] args) {

    String inputStr = "car, dog, rod";
    String[] words = inputStr.split(", ");
    String input1, input2, input3;
    input1 = words[0];
    input2 = words[1];
    input3 = words[2];

    for (int i = 0; i < words.length; i++){
        System.out.println(words[i]);
    }

    int len = input1.concat(input2).concat(input3).length();
    System.out.println("test " + input1 + " = " + input2 + " = " + input3);
    for(int i = 0; i < input3.length(); i++){
        for(int j = i; j <= input3.length(); j++) {
            String tmpSubStr = input3.substring(i, j);
            String tmpLongStr = input1.concat(tmpSubStr).concat(input2);
            if (tmpLongStr.contains(input3)){
                if(tmpLongStr.length() < len){
                    len = tmpLongStr.length();
                }
                System.out.println(tmpLongStr.length());
            }
        }
    }

    System.out.println(" scsc "+ len);
    //["","r", "o","d","ro","od","rod"]

    }
}
