package outubro;

import java.util.Scanner;

public class Pratica7 {
    public static void main (String[] args) {
        //Crie um array com os 10 primeiros
        //números naturais e exiba-os.
        Scanner entrada = new Scanner(System.in);
        int[] num = {0, 1, 2, 3, 4,
                5, 6, 7, 8, 9, 10};
        int i = 0;

        while (i < num.length) {
            if(i == num.length - 1){
                System.out.print("");
            }
            System.out.print(num[i] + ", ");
            i++;
        }
    }
}
