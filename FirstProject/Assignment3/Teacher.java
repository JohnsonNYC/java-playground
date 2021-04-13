package FirstProject.Assignment3;

public class Teacher {
  private String teacherName;
  private int employeeId;
  private String subject;
  private double salary;
  private Bachelor bachelor; //Aggregation "Has a" relationship

  private static int counter;
  static{
    counter = 1;
  }


  Teacher(String teacherName, String subject, double salary, Bachelor bachelor) {
    this.teacherName = teacherName;
    this.subject = subject;
    this.salary = salary;
    this.bachelor = bachelor;
    this.employeeId = ++counter;
  }

  public void displayDetails(){
    // System.out.println("Name: " + teacherName);
    // System.out.println("Subject: " + subject);
    // System.out.println("Salary: " + salary);
    // System.out.println("Bachelor: " + bachelor.getDegree());
    System.out.println("Employee ID: " + employeeId + " Counter: " + counter);
  }

}
