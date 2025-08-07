import java.util.Scanner;

public class Teste4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); //criação de um objeto para ultilizar o comando scanear 

    String x;
    System.out.println("Digite uma palavra:");
    x = sc.next();
    System.out.println("Voce digitou: " + x);

   

    int y;
    System.out.println("Digite um numero:");
    y = sc.nextInt();
    System.out.println("Voce digitou: " + y);


    double z;

    System.out.println("Digite um numero:");
    z = sc.nextDouble();
    System.out.println("Voce digitou: " + z);

    char f;

    System.out.println("Digite uma letra:");
    f = sc.next().charAt(0);
    System.out.println("Voce digitou: " + f);
    sc.close();
    
  }
}
