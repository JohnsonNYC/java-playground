package FirstProject.src;

public class Teacher extends Faculty{
  private String qualification;

  Teacher(String name, float basicSalary, String qualification){
    super(name,basicSalary);
    this.qualification = qualification;
  }

  @Override
  public double calculateSalary(){
    double salary = super.calculateSalary();
    if(qualification.equals("Doctoral")) salary += 20000;
    if(qualification.equals("Masters")) salary += 18000;
    if(qualification.equals("Bachelors")) salary += 15500;
    if(qualification.equals("Associate")) salary += 10000;

    return salary;
  }

  public String getQualification(){
    return qualification;
  }

  public void setQualification(String qualification){
    this.qualification = qualification;
  }
}
