package outubro;

import java.util.Scanner;

public class Pratica5 {
    /*Leia 5 números do usuário,
    guarde em um array e calcule a soma.*/
    // 04/10/25 8:05 am
    // Desafio 5
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5]; // cria um array com 5 posições
        int x = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();
            entrada.nextLine();
            if (i == numeros.length - 1) {
                x = i;
            }
        }
        System.out.println("Números digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i == numeros.length - 1) {
                System.out.print("");
            }else{
                System.out.print(", ");
                }
            }
        x = 0;
        for (int numero : numeros) {
            x += numero;
        }
        System.out.println("\nA soma dos números digitados é: " + x);

        entrada.close();
    }
}
