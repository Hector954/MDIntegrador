package com.mycompany.md_integrador;

/**
 *
 * @author Armando
 * @author Hector
 */
public class mUnion {

    private String[] arrayA;
    private String[] arrayB;
    private String[] result;

    private int sizeA;
    private int sizeB;

    public void ConjuntoCa(int sizeA) {
        this.sizeA = sizeA;
        arrayA = new String[sizeA];
    }

    public void ConjuntoCb(int sizeB) {
        this.sizeB = sizeB;
        arrayB = new String[sizeB];
    }

    public void setCa(String Ca, int i) {
        arrayA[i] = Ca;
    }

    public void setCb(String Cb, int i) {
        arrayB[i] = Cb;
    }

    public int getSizeA() {
        return sizeA;
    }

    public int getSizeB() {
        return sizeB;
    }

    public String getCa(int i) {
        return arrayA[i];
    }

    public String getCb(int i) {
        return arrayB[i];
    }

    public String unir() {
        int count = 0;
        int aux = 0;
        String imprimir = "";

        result = new String[sizeA + sizeB];
        for (int i = 0; i < sizeA; i++) {
            result[i] = arrayA[i];
        }

        count = sizeA;

        for (int i = 0; i < sizeB; i++) {
            aux = 0;
            for (int j = 0; j < sizeA + sizeB; j++) {
                if (arrayB[i].equals(result[j])) {
                    aux = 1;
                }
            }
            if (aux == 0) {
                result[count] = arrayB[i];
                count++;
            }
        }
        
        for (int i = 0; i < sizeA + sizeB; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ";";
            }
        }
        return imprimir;
    }
}
