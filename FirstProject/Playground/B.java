package FirstProject.Playground;

public class B extends A{
  private int num1;
  private int num2;

// Extends from abstract class
// Do I override the method or just define it here?
// Can abstract classes have instance variables?
// Can they be initiated and accessed in child class?

public int sumOfTwo(){
  int result = num1 + num2;
  return result;
}

public int productOfTwo(){
  int result = num1 * num2;
  return result;
}
  public static void main(String[] args) {
    
  }
  // As seen below, they must be overwritten 
  // @Override
  // public int sumOfTwo() {
  //   // TODO Auto-generated method stub
  //   return 0;
  // }

  // @Override
  // public int productOfTwo() {
  //   // TODO Auto-generated method stub
  //   return 0;
  // }
}
