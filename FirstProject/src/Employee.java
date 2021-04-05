package FirstProject.src;

public class Employee {
  private int employeeId; 
  private static int counter = 1000;

  public Employee(){
    employeeId = ++counter;
  }

  public int getEmployeeId(){
    return employeeId;
  }

  public static int getCounter(){
    return counter;
  }
}
