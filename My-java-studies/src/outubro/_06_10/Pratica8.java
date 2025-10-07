package outubro._06_10;

import java.util.Scanner;

public class Pratica8 {
    public static void main(String[] args){
        /*Desafio 8: Calcule a média dos
        valores de um array.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números quer calcular?: ");
        int numeros = sc.nextInt();
        int soma = 0;

        int[] numList = new int[numeros];

        for (byte i=0; i < numeros; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numList[i] = sc.nextInt();
        }
        for (int i=0; i < numList.length; i++){
            soma += numList[i];
        }
        int media = soma/numeros;
        System.out.println("A média dos valores digitados é: " + media);
    }
}
