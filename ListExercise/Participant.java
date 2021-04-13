package ListExercise;
import java.util.*;

public class Participant {
  private String name;
  private String talent;
  private float score;
  private int id;
  static int counter;

  static{
    counter = 0;
  }
  Participant(String name, String talent, float score){
    this.name = name;
    this.talent = talent;
    this.score = score;
    this.id = ++counter;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getTalent(){
    return this.talent;
  }
  public void setTalent(String talent){
    this.talent = talent;
  }

  public float getScore(){
    return this.score;
  }

  public void setScore(float score){
    this.score = score;
  }

  public static void main(String[] args) {
    List<Participant> list = new ArrayList<Participant>();
    list.add(new Participant("Hazel", "Singing", 29.75f));
    list.add(new Participant("Hudson", "Instrumental", 28.00f));
    list.add(new Participant("Enoch", "Singining", 28.95f));
    list.add(new Participant("Bonsy", "Dance", 27.67f));

    for(Participant person: list){
      System.out.println("Particpant " + person.id);
      System.out.println(person.getName());
      System.out.println(person.getTalent());
      System.out.println(person.getScore());
    }
    float maxScore = 0;
    String maxPerson = "";
    for(int i = 0; i < list.size(); i++){
      float maxCheck = Math.max(maxScore, list.get(i).getScore());
      if(maxCheck > maxScore){
        maxPerson = list.get(i).getName();
        maxScore = maxCheck;
      }
    }
    System.out.println("The participant with the highest score is: " + maxPerson);
  }
}
