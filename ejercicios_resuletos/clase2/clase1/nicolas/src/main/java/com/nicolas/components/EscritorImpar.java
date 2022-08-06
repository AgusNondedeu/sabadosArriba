package com.nicolas.components;

public class EscritorImpar implements EscritorNumero{

    @Override
    public void escribirNumero(int numero) {
        System.out.println("--------------------------------------------------------");
        System.out.println(numero);
        System.out.println("--------------------------------------------------------");
    }
}
