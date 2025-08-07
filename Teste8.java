import java.util.Scanner;

public class Teste8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int plano;
    int valorapagar = 2;
    int resto = 0;
    int recibo = 0;

    System.out.println("Digite suas horas gastas: ");
    plano = sc.nextInt();

    if(plano > 100){

      resto = plano % 100;
      recibo = resto * valorapagar;

      plano = 50 + recibo;

     System.out.println("Pague: " + plano);
      
     
    } else {
     System.out.println("Pague: 50$");
    }






    sc.close();
  }
}
