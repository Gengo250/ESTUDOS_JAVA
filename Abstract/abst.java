package Abstract;

public class abst {
  public static void main(String[] args) {
    // Veiculo veiculo = new Veiculo(); -> com a classe abastrata não podemos mais criar objetos desta classe, isso adiciona uma camada a mais de segurança ao seu projeto
      
    //Caso for aplicado abstract a uma classe o usuário não pode instânciar esta classe
    // Caso for aplicado abstract a um método deve-se declarar sem implementação de corpo (exemplo: public abstract void go();)
    
    Carro carro = new Carro();

    carro.go();
  }
}
