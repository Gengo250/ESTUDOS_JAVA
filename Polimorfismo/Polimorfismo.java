package Polimorfismo;
public class Polimorfismo {
  public static void main(String[] args) {
    //treinamento de conceito de polimorfismo
    carro carro1 = new carro();
    bicicleta bicicleta1 = new bicicleta();
    moto moto1 = new moto();

    veiculo[] veiculos = {carro1, bicicleta1, moto1}; //usa um objeto da classe principal como um array que armazena os objetos carro1, bicicleta1, moto1 

    for(veiculo x : veiculos){   //usa um for com um referencial nominado como "x" para percorrer o array e usar o metodo "go" de cada objeto do array
      x.go();
    }
  }
}
