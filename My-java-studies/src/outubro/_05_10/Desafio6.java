package outubro._05_10;

import java.util.Scanner;

public class Desafio6 {
    //Implemente uma função que receba um
    //número inteiro e retorne se ele é par ou ímpar.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        long a;

        System.out.print("Escreva um número inteiro: ");
        a = entrada.nextLong();
        entrada.nextLine();
        if (a % 2 == 0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é ímpar!");
        }

    }
}
