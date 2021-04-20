package FirstProject.Assignment7;

public class Dog {
  private String breed;
  private int ageInMonths;

  Dog(String breed, int ageInMonths){
    this.breed = breed;
    this.ageInMonths = ageInMonths;
  }

  public int compareTo(Dog dog){
    
    return 0;
  }
  public String getBreed(){
    return this.breed;
  }

  public void setBreed(String breed){
    this.breed = breed;
  }

  public int getAge(){
    return this.ageInMonths;
  }

  public void setAge(int ageInMonths){
    this.ageInMonths = ageInMonths;
  }
}
