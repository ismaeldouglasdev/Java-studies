package outubro._04_10;

import java.util.Scanner;

public class Pratica4 {
    /*Faça um programa com um switch
    que imprima o nome do dia da semana
    dado um número (1 a 7).*/
    // 04/10/25 7:55 am
    // Desafio 4
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número (entre 1 a 7): ");
        byte numero = entrada.nextByte();
        entrada.nextLine();
        System.out.println("Dia escolhido:");

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido.");
        }
    }
}
