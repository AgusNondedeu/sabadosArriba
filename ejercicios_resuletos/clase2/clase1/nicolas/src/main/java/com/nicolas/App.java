package com.nicolas;

import com.nicolas.components.EscritorWrapper;
import com.nicolas.components.EscritorNumero;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Bienvenidos");

        EscritorNumero escritor = new EscritorWrapper();

        for(int i = 0; i < Integer.parseInt(args[0]); i++){
            escritor.escribirNumero(i);
        }

        return;
    }
}
