package outubro;

import java.util.Scanner;

public class Pratica3 {
    /*Crie um programa que leia a idade
    do usuário e diga se é maior de idade.*/
    // 04/10/25 7:40 am
    // Desafio 3
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idade = entrada.nextByte();
        entrada.nextLine();

        if(idade < 18){
            System.out.println("Você é menor de idade.");
        }else{
            System.out.println("Você é maior de idade.");
        }
    }
}
