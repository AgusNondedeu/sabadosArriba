package com.nicolas.components;

public class EscritorWrapper implements EscritorNumero{
    private final EscritorNumero escribirPar;
    private final EscritorNumero escribirImpar;

    public EscritorWrapper(){
        escribirPar = new EscritorPar();
        escribirImpar = new EscritorImpar();
    }

    @Override
    public void escribirNumero(int numero) {
        if(numero % 2 == 0)
            escribirPar.escribirNumero(numero);
        else
            escribirImpar.escribirNumero(numero);
    }
}
