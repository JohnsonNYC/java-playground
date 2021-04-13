package FirstProject.Assignment3;

public class Bachelor {
  private String major; 
  private String degree; 

  Bachelor(String major, String degree){
    this.major = major; 
    this.degree = degree;
  }

  public String getMajor(){
    return major;
  }

  public void setMajor(String major){
    this.major = major;
  }

  public String getDegree(){
    return degree;
  }

  public void setDegree(String degree){
    this.degree = degree;
  }
}
