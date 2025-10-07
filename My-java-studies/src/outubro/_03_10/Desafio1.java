package outubro._03_10;

public class Desafio1 {
    //Desafio 1:
    /*Declaração de variáveis: Crie variáveis
    de diferentes tipos primitivos
    (int, double, char, boolean) e
    imprima seus valores.
     */
    int idade = 12;
    double pi = 3.14;
    char letraFavorita = 'A';
    boolean botaoAtivo = true;

    public static void main(String[] args) {
        Desafio1 p = new Desafio1(); // cria um objeto para acessar as variáveis da  instância.
        System.out.println(p.idade);
        System.out.println(p.pi);
        System.out.println(p.letraFavorita);
        System.out.println(p.botaoAtivo);
    }

}
