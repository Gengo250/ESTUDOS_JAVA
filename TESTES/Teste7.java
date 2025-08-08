import java.util.Scanner;

public class Teste7 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     double a,b,c,delta;
     double x1, x2;

     System.out.println("BEM-VINDO A CALCULADORA DE BASKARA");
     System.out.println("Digite sua expressão: ");
     System.out.println("Digite o valor de a: ");
     a = sc.nextDouble();
     System.out.println("Digite o valor de b: ");
     b = sc.nextDouble();
     System.out.println("Digite o valor de c: ");
     c = sc.nextDouble();


     delta = Math.pow(b,2) - 4 * a *c;
     x1 = (-b + Math.sqrt(delta)) / (2*a);
     x2 = (-b - Math.sqrt(delta)) / (2*a);

     if(delta == 0){
       x1 = x2;
        System.out.println("Sua funcao tem apenas uma raiz real " +  x1);

     } else if(delta > 0){
       

        System.out.println("Sua funcao possui duas raizes reais: ");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

     } else {
        System.out.println("delta menor que zero a raiz é imaginaria");
     }

     sc.close();
  }
}
