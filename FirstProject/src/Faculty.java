package FirstProject.src;

public class Faculty {
  private String name;
  private float basicSalary;
  private float bonusPercentage = 4f;
  private float carAllowancePercentage = 2.5f;

  Faculty(String name, float basicSalary){
    this.name = name;
    this.basicSalary = basicSalary;
  }

  public double calculateSalary(){
    return basicSalary + ((bonusPercentage/100) *basicSalary) + ((carAllowancePercentage/100)*basicSalary);
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name; 
  }

  public float getBasicSalary(){
    return basicSalary;
  }

  public void setBasicSalary(float basicSalary){
    this.basicSalary = basicSalary;
  }

  public float getBonusPercentage(){
    return bonusPercentage;
  }

  public void setBonusPercentage(float bonusPercentage){
    this.bonusPercentage = bonusPercentage;
  }

  public float getCarAllowance(){
    return carAllowancePercentage;
  }

  public void setCarAllowance(float carAllowancePercentage){
    this.carAllowancePercentage = carAllowancePercentage;
  }
}
