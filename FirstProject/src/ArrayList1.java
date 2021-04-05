package FirstProject.src;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
  public static void main(String[] args) {
    List<String> employees = new ArrayList<String>();
    employees.add("Alex");
    employees.add("Tom");
    employees.add("Sam");
    employees.add("john");
    employees.add("Jack");
    updateEmployees(employees);
    System.out.println(employees);
    // Alex John Tom Robert  Steve Sam john Jack;
  }

  public static void updateEmployees(List<String> employees){
    String[] newEmployees = {"John", "Jack", "Robert", "Steve"};
    for(int counter=0; counter < newEmployees.length; counter++){
      if(!employees.contains(newEmployees[counter])){
        employees.add(counter + 1, newEmployees[counter]);
      }
    }
  }
}
