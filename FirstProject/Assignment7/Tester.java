package FirstProject.Assignment7;
import java.util.*;
//Create arrayList of Input
// Create Treemap < String, Arraylist> 
// if(dogBreed from arrayList exists as a key)
    // add dogAge to ArrayList
// else if it doesnt not exist
// create the key and creaty the list and add the age to the list
public class Tester {
  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList();
    dogs.add(new Dog("Companion", 10));
    dogs.add(new Dog("Herding", 4));
    dogs.add(new Dog("Terrier", 15));
    dogs.add(new Dog("Companion", 7));
    dogs.add(new Dog("Terrier", 15));
    dogs.add(new Dog("Terrier", 9));
    dogs.add(new Dog("Herding", 10));
    dogs.add(new Dog("Herding", 10));
    
    // Create Tree Map 
    Map<String, List<Integer>> dogStore = new TreeMap<String, List<Integer>>();

    // For each dog in the ArrayList, add the breed as the key and add the age to the list;
    for(Dog dog: dogs){
      if(dogStore.containsKey(dog.getBreed())){
        // List<Integer> valueArray = dogStore.get(dog.getBreed());
        // valueArray.add(dog.getAge());
        dogStore.get(dog.getBreed()).add(dog.getAge());
        dogStore.put(dog.getBreed(), dogStore.get(dog.getBreed()));
      }else{
        List<Integer> valueArray = new ArrayList<Integer>();
        valueArray.add(dog.getAge());
        dogStore.put(dog.getBreed(), valueArray);
      }
    }

    Set<String> outputStore = new HashSet<String>();

    for(Map.Entry<String, List<Integer>> dogObj: dogStore.entrySet()){
      //Sort all elements from the values Array <k, v[]> 
      Collections.sort(dogObj.getValue());
      
      // for each dogObject
      // create a string and append the breed, age, and frequency to the string
      for(Integer age : dogObj.getValue()){
        String output = dogObj.getKey() + " - Age: " + age + " months - Count: " + Collections.frequency(dogObj.getValue(), age);
        outputStore.add(output);
      }
    }

    for(String output: outputStore){
      System.out.println(output);
    }
  }
}
