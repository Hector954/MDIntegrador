package com.mycompany.md_integrador;

/*
 * @author Armando Moran
 * @author Hector Paramo
 */
public class operadores {

    private String[] result;

    // metodo unir
    public String unir(String[] arrayA, String[] arrayB) {
        int count = 0, n = 0;
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

        result = limpiar(result);

        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
                n++;
            }
        }
        if (n > 0) {
            return imprimir.substring(0, imprimir.length() - 1);
        } else {
            return " ";
        }
    }

    // metodo inserccion
    public String interseccion(String[] arrayA, String[] arrayB) {

        result = new String[Math.max(arrayA.length, arrayB.length)];
        String imprimir = " ";

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    result[i] = arrayA[i];
                }
            }
        }

        result = limpiar(result);

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
            }
        }
        return imprimir.substring(0, imprimir.length() - 1);
    }

    // Metodo diferencia 
    public String DiferenciaA(String[] arrayA, String[] arrayB) {

        int count = 0, n = 0;
        int aux = 0;
        String imprimir = "";
        // crea un arreglo con el tamano de los otros dos
        result = new String[arrayA.length + arrayB.length];
        // Compara ambos arreglos y busca los no repetidos en A
        for (int i = 0; i < arrayA.length; i++) {
            aux = 0;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayA[i];
                count++;
            }
        }

        result = limpiar(result);

        // salida en pantalla
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
                n++;
            }
        }
        if (n > 0) {
            return imprimir.substring(0, imprimir.length() - 1);
        } else {
            return " ";
        }

    }

    public String DiferenciaB(String[] arrayA, String[] arrayB) {

        int count = 0, n = 0;
        int aux = 0;
        String imprimir = "";

        result = new String[arrayA.length + arrayB.length];

        // No repetidos en B 
        for (int i = 0; i < arrayB.length; i++) {
            aux = 0;
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayB[i].equals(arrayA[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayB[i];
                count++;
            }
        }

        result = limpiar(result);

        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
                n++;
            }
        }
        if (n > 0) {
            return imprimir.substring(0, imprimir.length() - 1);
        } else {
            return " ";
        }
    }

    // diferencia simetrica
    public String DiferenciaSimetrica(String[] arrayA, String[] arrayB) {
        int count = 0, n = 0;
        int aux = 0;

        String imprimir = ""; //Salida de Pantalla
        result = new String[arrayA.length + arrayB.length];//Llena de Nullos Conjunto Resultante
        //Los no Repetidos de A
        for (int i = 0; i < arrayA.length; i++) {
            aux = 0;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayA[i];
                count++;
            }
        }
        //Los no Repetidos de B
        for (int i = 0; i < arrayB.length; i++) {
            aux = 0;
            for (int j = 0; j < arrayA.length; j++) {
                if (arrayB[i].equals(arrayA[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayB[i];
                count++;
            }
        }

        result = limpiar(result);

        //Llena String para Salida en Pantalla
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
                n++;
            }
        }

        if (n > 0) {
            return imprimir.substring(0, imprimir.length() - 1);
        } else {
            return " ";
        }
    }

    public String[] limpiar(String[] rlimpio) {

        for (int i = 0; i < rlimpio.length; i++) {
            for (int j = 0; j < rlimpio.length; j++) {
                if (i != j && rlimpio[j] != null) {
                    if (rlimpio[j].equals(rlimpio[i])) {
                        rlimpio[j] = null;
                    }
                }
            }
        }
        return rlimpio;
    }
}
