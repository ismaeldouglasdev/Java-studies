package outubro._07_10.Desafio11;

public class Main {
    /*Faça uma classe Pessoa com atributos
    nome e idade, com métodos get e set.
     */
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Márcio", (byte) 25);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        p1.setNome("Júlia");
        System.out.println("Nome: " + p1.getNome());
        p1.setIdade((byte) 28);
        System.out.println("Nome: " + p1.getIdade());
    }
}
