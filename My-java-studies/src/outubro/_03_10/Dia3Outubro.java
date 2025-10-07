package outubro._03_10;

import java.util.Scanner;

public class Dia3Outubro {
    public static void main(String[] args) {
        //Aula momento: "1h7min"
        String nome;
        String idade;
        String profissao;

        Scanner entradaUsuario = new Scanner(System.in);


        System.out.println("Qual é o seu nome?");
        nome = entradaUsuario.nextLine();

        System.out.println("Qual é a sua idade?");
        idade = entradaUsuario.nextLine();

        System.out.println("Qual é a sua profissão?");
        profissao = entradaUsuario.nextLine();

        System.out.println("Meu nome é " + nome + " eu tenho "
                + idade + " anos " + "e sou " + profissao + ".");

    }
}