package FirstProject.Playground;

public class Student {
  public int studentId;
  private String studentName;
  private int yearOfEnrollment;
  public static int counter;

  static{
    counter = 500;
  }
  
  Student(String name, int yearOfEnrollment){
    this.studentName = name;
    this.yearOfEnrollment = yearOfEnrollment;
    this.studentId = ++counter;

  }

  public static int getNoOfStudent(){
    return counter - 500;
  }

  public static void main(String[] args) {
    Student student = new Student("Johnson", 2020);
    Student student1 = new Student("Alex", 2020);
    Student student2 = new Student("Min", 2020);
    System.out.println(student.studentId);
    System.out.println(student1.studentId);
    System.out.println(student2.studentId);
    System.out.println(Student.getNoOfStudent());
  }
}
