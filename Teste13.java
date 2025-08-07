public class Teste13 {
  public static void main(String[] args) {
    Carro meuCarro = new Carro("Fusca");
    meuCarro.PrintCrarro();

  }
}

class Carro {
  String modelo;
  public Carro(String modelo){
    this.modelo = modelo;
  }

  public void PrintCrarro(){
    System.out.println("Carro " + this.modelo);
  }
}
