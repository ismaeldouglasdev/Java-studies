package outubro._07_10.Desafio12;

import java.util.Scanner;

public class ContaBancaria {
    static int saldo = 0;
    public static void main(String[] args) {
    }
    public static void Depositar() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("Digite o quanto quer depositar: ");
        a = sc.nextInt();
        saldo += a;
        System.out.println("Valor Depositado: " + a);
        System.out.println("Saldo atual: " + saldo);
    }
}

