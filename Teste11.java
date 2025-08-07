import java.util.Scanner;

public class Teste11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N;
    int i;
    int x = 4;
    int soma = 0;

    N = sc.nextInt();
    sc.close();

    for(i = 0; i < N; i++){
     soma = soma + x;
    }

    System.out.println(soma);

    
  }
}
