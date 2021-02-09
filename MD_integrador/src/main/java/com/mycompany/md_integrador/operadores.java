/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.md_integrador;

/**
 *
 * @author Armando
 *//////
public class operadores {
    private String[] result;

    public String unir(String [] arrayA, String [] arrayB) {
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
}
