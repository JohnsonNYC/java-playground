package FirstProject.Playground;

public class Bank {
  String bankName, area, phonNo;

  Bank(){
    System.out.println("Inside Constructor");
  }

  public static void main(String[] args) {
    Bank bank = new Bank();
    System.out.println(bank.bankName);
  }

}
