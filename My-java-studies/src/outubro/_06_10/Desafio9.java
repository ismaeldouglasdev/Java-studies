package outubro._06_10;

import java.util.Scanner;

public class Desafio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*Escreva a tabuada de multiplicar
        para um número fornecido.*/
        int a;
        System.out.print("Digite um número,\npara ver a sua tabuada: ");
        a = sc.nextInt();
        for(int i=0; i < 11; i++){
            System.out.println(i + " x " + a + " = " + (i*a));
        }

    }
}
