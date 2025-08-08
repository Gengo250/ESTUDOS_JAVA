package Abstract;

public class Carro extends Veiculo {
  @Override //sobrescrição do método abstrato go()
  public void go(){
    System.out.println("ESta correndo");
  }
}
