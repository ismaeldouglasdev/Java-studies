package poo.heranca;

public class Veiculo {

    String cor;
    String placa; //var de instância

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesVeiculo(String veiculo){
        System.out.println(veiculo + " tem a cor " + cor + " e o número da placa é: " + placa);
    }


    public void acelerar(String veiculo){
        System.out.println(veiculo + " está em movimento.");
    }

    public void frear(String veiculo){
        System.out.println(veiculo + " reduziu a velocidade.");
    }

    public void abastecer(String veiculo, String combustivel){
        System.out.println(veiculo + " está sendo abastecido com: " + combustivel);
    }
}
