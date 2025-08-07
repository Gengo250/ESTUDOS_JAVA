import java.util.Scanner;

public class Teste10 {
  public static void main(String[] args) {
    int x = 99;
    int y = 99;

   Scanner sc = new Scanner(System.in);
    do{
      System.out.println("Digite a coordenada x: ");
      x = sc.nextInt();
      System.out.println("Digite a coordenada y: ");
      y = sc.nextInt();
      
    }
    while(x != 0 || y != 0);

       

    
    sc.close();
  }

}
