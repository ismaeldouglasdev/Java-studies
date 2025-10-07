package outubro._07_10.Desafio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    /*Crie um metodo que receba dois
    números e retorne o maior.
     */
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        if(a > b){
            System.out.println("O número " + a + " é maior que " + b + ".");
        }else{
            System.out.println("O número " + b + " é maior que " + a + ".");
        }

    }
}
