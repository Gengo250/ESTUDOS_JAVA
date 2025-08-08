import java.util.Scanner;

public class Teste18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Aluno aluno = new Aluno();

    System.out.println("Digite seu nome:");
    aluno.name = sc.nextLine();
    System.out.println("Digite sua nota1:");
    aluno.nota1 = sc.nextDouble();
    System.out.println("Digite sua nota2:");
    aluno.nota2 = sc.nextDouble();
    System.out.println("Digite sua nota3:");
    aluno.nota3 = sc.nextDouble();

    double total = aluno.pontuacaofinal();
    boolean passou = aluno.aprovado();

    System.out.println("Resultado para "+ aluno.name);

    if(passou){
      System.out.println("Status: APROVADO");
      System.out.println("Pontuacao final:" + total);
    } else {
      System.out.println("Status: REPROVADO");
      System.out.println("Faltaram:" + (60.0 - total) + " pontos para atingir 60");
    }

    sc.close();
  }
}

class Aluno{
  public String name;
  public double nota1;
  public double nota2;
  public double nota3;

  public double pontuacaofinal(){
    return nota1 + nota2 +nota3;
  }

  public boolean aprovado(){
    return pontuacaofinal() >= 60.0;
  }


}
