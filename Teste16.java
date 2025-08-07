import java.util.Scanner;

public class Teste16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Retangulo retangulo = new Retangulo();

    System.out.println("Digite o comprimento do seu retangulo:");
    retangulo.comprimento = sc.nextDouble();
    System.out.println("Digite a largura do seu retangulo:");
    retangulo.largura = sc.nextDouble();


    double area = retangulo.area();
    double perimetro = retangulo.perimetro();
    double diagonal = retangulo.diagonal();


    System.out.println("Resultados");
    System.out.println("Area:" + area);
    System.out.println("Perimetro" + perimetro);
    System.out.println("Diagonal:" + diagonal);


    sc.close();
  }
}

class Retangulo{
  public double comprimento;
  public double largura;

  public double area(){
    return comprimento*largura;
  }

  public double perimetro(){
    return 2 *(comprimento+largura);
  }

  public double diagonal(){
    return Math.sqrt(Math.pow(largura,2)+ Math.pow(comprimento,2));
  }
}
