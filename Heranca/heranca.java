package Heranca;

public class heranca {
  public static void main(String[] args) {
   
    Acocount acc1 = new Acocount(1001, "alex", 1000.0);
    acc1.withDraw(200.0);
    System.out.println(acc1.getBalance());

    Acocount acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    acc2.withDraw(200.0);
    System.out.println(acc2.getBalance());

    Acocount acc3 = new BusinessAccount(1003, "Alexandre", 1000.0, 500.0);
    acc3.withDraw(200.0);
    System.out.println(acc3.getBalance());  

  }
}
