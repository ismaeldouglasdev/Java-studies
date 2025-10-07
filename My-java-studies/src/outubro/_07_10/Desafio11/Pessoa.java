package outubro._07_10.Desafio11;

public class Pessoa {
    private String nome;
    private byte idade;

    public Pessoa(String nome, byte idade){
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters de nome:
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // getters e setters de idade:
    public byte getIdade(){
        return idade;
    }

    public void setIdade(byte idade){
        this.idade = idade;
    }


}
