package com.nicolas.components;

public class EscritorPar implements EscritorNumero{

    @Override
    public void escribirNumero(int numero) {
        System.out.println();
        System.out.println(numero);
        System.out.println();
    }
}
