import java.util.Scanner;

public class Teste17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Funcionario funcionario = new Funcionario();

    System.out.println("Digite seu nome:");
    funcionario.name = sc.nextLine();
    System.out.println("Digite seu salario bruto:");
    funcionario.salario = sc.nextDouble();
    System.out.println("Digite sua taxa salarial:");
    funcionario.taxa = sc.nextDouble();
    System.out.println("Digite sua porcentagem de incremento salarial:");
    funcionario.porcentagem = sc.nextDouble();

    double salarioLiquido = funcionario.salarioLiquido();


     funcionario.salario = salarioLiquido;

     funcionario.incrementaSalario(funcionario.porcentagem);

     System.out.println("Perfil atualizado");
     System.out.println("nome:" + funcionario.name);
     System.out.println("Salario Liquido(pos taxa):" + salarioLiquido);
     System.out.println("Salario Liquido(pos incremento salarial):" + funcionario.salario);






    sc.close();
  }
}

class Funcionario{
  public double salario;
  public String name;
  public double porcentagem;
  public double taxa;

  public double salarioLiquido(){
    return salario - taxa;
  }

  public void incrementaSalario(double porcentagem){
    double fator = porcentagem / 100;
    salario += salario * fator;
  }

}
