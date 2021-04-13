package FirstProject.DataStructures;

public class ArrayTest {
  public static void main(String[] args) {
    //Declaring and initializing the array in one line;
    // dataType[] arrayVarName = {elementsOfArraySeperateByComma};
      String[] names = {"Johson", "Rosario", "Luis"};
    

    // Creating the array using new 
    // dataType[] arrayVarName = new dataType[size];
    // arrayVarName[index] = element;
      String[] names2 = new String[3];
      names2[0]="Johnson";
      names2[1]="Rosario";
      names2[2]="Luis";

    // Declaring and creating the array in different lines;
    // dataType [] arrayVarName;
    // arrayVarName = new dataType[size];
    // arrayVarName[index] = element;

      String[] names3;
      names3 = new String[3];
      names3[0] = "Johnson";
      names3[1] = "Rosario";
      names3[2] = "Kow";

    for(String name : names3){
      if(name == "Johnson"){
        name = "Paulo";
      }
      System.out.println(name);
    }

    // POINTS TO REMEMBER 
    // An array is a collection of similar data 
    // can be used to store data of primitive types as well as reference types
    // Holds a fixed number of values
    // Once initialized, the size of the array cannot be changed
    
  }
}
