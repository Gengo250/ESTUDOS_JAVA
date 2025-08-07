import java.util.Scanner;

public class Teste9 {
  public static void main(String[] args) {
    int senha = 2020;
    int i = 0;
    Scanner sc = new Scanner(System.in);

    while(i != senha){
      System.out.println("Digite sua senha:");
      i = sc.nextInt();
      if(i != senha){
        System.out.println("Senha incorreta");
      }

    }
    System.out.println("Senha correta");
    sc.close();
  }
}
