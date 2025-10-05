import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Operadores Aritméticos:

        + Soma
        - Subtração
        * Multiplicação
        / Divisão
        % Resto da divisão

        Operadores Relacionais:
        Operadores de igualdade (==, !=)
        Operadores Relacionais (>, >=, <, <=)

        if(condição){
            Código que vai ser executado
        }else{
        }

        Operadores lógicos (|| e &&)
        */
        /*int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;*/

        //Arrays
        //String[] listaCompras = {"Arroz","Carne",
        //          //      "Ovos", "Feijão", "Batata", "Acabate"};
        /*while(listaCompras.length <= 6){
            System.out.println(listaCompras[indice]);
            indice++;*/

        /*for (int indice = 0; listaCompras.length <= 7; indice++) {
            System.out.println(listaCompras[indice]);
        }*/

        byte opcoesBanco = 0;

        System.out.println("" +
                "Escolha uma opção: \n" +
                "1 - Ver fatura do cartão \n" +
                "2 - Saldo conta corrente \n" +
                "3 - Poupança \n" +
                "4 - Câmbio"
        );
        Scanner entradaUsuario = new Scanner(System.in);
        opcoesBanco = entradaUsuario.nextByte();

        switch (opcoesBanco){
            case 1:
                System.out.println("Ver fatura do cartão.");
                break;
            case 2:
                System.out.println("Saldo conta corrente.");
                break;
            case 3:
                System.out.println("Poupança");
                break;
            case 4:
                System.out.println("Câmbio");
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada!");

        }

        System.out.println();
    }
}
