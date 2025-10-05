package poo;

import java.util.Scanner;

//Curso de Java do zero ao avançado 03/10/25
public class Main {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        Carro carro = new Carro();
        carro.acelerar("O carro está em movimento...");
        carro.frear("Velocidade foi reduzida");

        Moto moto = new Moto();
        moto.acelerar("A moto está em movimento...");
        moto.frear("Velocidade foi reduzida");
        System.out.println();

    }
}
