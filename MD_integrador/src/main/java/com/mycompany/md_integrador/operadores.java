package com.mycompany.md_integrador;

import java.util.ArrayList;

/**
 * @author Luis Armando Moran
 * @author Hector Paramo
 */
public class operadores {

    private String[] result;

    public String unir(String[] arrayA, String[] arrayB) {
        int count = 0;
        int aux = 0;
        String imprimir = "";

        result = new String[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            result[i] = arrayA[i];
        }

        count = arrayA.length;

        for (int i = 0; i < arrayB.length; i++) {
            aux = 0;
            for (int j = 0; j < arrayA.length + arrayB.length; j++) {
                if (arrayB[i].equals(result[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayB[i];
                count++;
            }
        }

        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ";";
            }
        }
        return imprimir;
    }

    public String interseccion(String[] arrayA, String[] arrayB) {

        result = new String[Math.max(arrayA.length, arrayB.length)];
        String imprimir = "";

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    result[i] = arrayA[i];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ";";
            }
        }
        return imprimir;
    }

    public String complemento(String[] arrayA, String[] arrayB) {
        String imprimir = "";
         result = new String[arrayA.length + arrayB.length];
        
        for (int i = 0; i < arrayA.length; i++) {
            result[i] = arrayA[i];
        }
        for (int j = 0; j < arrayA.length; j++) {
            for (int i = 0; i < arrayB.length; i++) {
                if (result[j].equals(arrayB[i])) {
                    result[j] = arrayB[i];
                }
            }
        }
        
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ";";
            }
        }
        return imprimir;
    }
}
