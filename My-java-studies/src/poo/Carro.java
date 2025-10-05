package poo;

import poo.interfaces.Veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar(String texto) {
        System.out.println(texto);
    }

    @Override
    public void frear(String texto) {
        System.out.println(texto);
    }
}

