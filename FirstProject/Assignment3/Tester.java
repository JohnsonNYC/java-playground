package FirstProject.Assignment3;

public class Tester {
  public static void main(String[] args) {
    Bachelor bach = new Bachelor("Mechanical Engineer", "Bachelor of Science");
    Teacher teach1 = new Teacher("Bianca", "English", 80000, bach);
    Teacher teach2 = new Teacher("Alex", "Engineering", 80000, bach);
    //Teacher teach3 = new Teacher("Min", "Interior Design", 80000, bach);


    teach1.displayDetails();
    teach2.displayDetails();
    //teach3.displayDetails();
  }
}
