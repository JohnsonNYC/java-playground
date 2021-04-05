package FirstProject.src;

public class Tester {
  public static void main(String[] args) {
    Faculty faculty = new Faculty("Johnson", 80000f);
    System.out.println("Faculty");
    System.out.println("*******************");
    System.out.println(faculty.calculateSalary());

    OfficeStaff os = new OfficeStaff("Johnson", 80000f, "Accountant");
    System.out.println("Office Staff");
    System.out.println("*******************");
    System.out.println(os.calculateSalary());

    Teacher teacher = new Teacher("Johnson", 80000, "Doctoral");
    System.out.println("Teacher");
    System.out.println("*******************");
    System.out.println(teacher.calculateSalary());
  }
}
