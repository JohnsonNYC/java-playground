package FirstProject.src;

public class OfficeStaff extends Faculty{
  private String designation;
  OfficeStaff(String name, float basicSalary, String designation){
    super(name,basicSalary);
    this.designation = designation;
  }
  
  @Override
  public double calculateSalary(){
    double salary = super.calculateSalary();
    if(designation.equals("Accountant")) salary += 10000;
    if(designation.equals("Clerk")) salary += 7000;
    if(designation.equals("Peon")) salary += 4500;

    return salary;
  }

  public String getDesignation(){
    return designation;
  }

  public void setDesignation(String designation){
    this.designation = designation;
  }
}
