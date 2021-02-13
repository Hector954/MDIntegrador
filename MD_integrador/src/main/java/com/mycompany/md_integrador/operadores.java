package com.mycompany.md_integrador;

/**
 *
 * @author Armando Moran
 * @author Hector Paramo
 */
public class operadores {

    private String[] result;

    // metodo unir
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

    // metodo inserccion
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

    // metodo complemento
    public String complementoA(String[] arrayA, String[] arrayB) {
        
        String [] result;
        result=arrayA;
        String imprimir = "";
/*      segun yo igualo el result a A (seria mi universo result) 
        y lo que le no tenga B seria el complemento de A
        
*/
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i].equals(arrayB[j])) {
                    result[i] = null;
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

    // Metodo diferencia 
    public String DiferenciaA(String[] arrayA, String[] arrayB) {

        int count = 0;
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
        // salida en pantalla
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
            }
        }
        return imprimir;
    }

    public String DiferenciaB(String[] arrayA, String[] arrayB) {

        int count = 0;
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

        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (result[i] != null) {
                imprimir = imprimir + result[i] + ",";
            }
        }
        return imprimir;
    }
    
    // diferencia simetrica
     public String DiferenciaSimetrica(String[] arrayA, String[] arrayB){
        int count=0;
        int aux=0;
        

        
        String _Cadena=""; //Salida de Pantalla
        result=new String [arrayA.length+arrayB.length];//Llena de Nullos Conjunto Resultante
        //Los no Repetidos de A
        for (int i=0;i<arrayA.length;i++){
            aux=0;
            for (int j=0;j<arrayB.length;j++){
                if (arrayA[i].equals(arrayB[j]))           
                  aux=1;  
            }
            if (aux==0){
            result[count]=arrayA[i];
            count++;
            }
        }
        //Los no Repetidos de B
        for (int i=0;i<arrayB.length;i++){
            aux=0;
            for (int j=0;j<arrayA.length;j++){
                if (arrayB[i].equals(arrayA[j]))           
                  aux=1;  
            }
            if (aux==0){
            result[count]=arrayB[i];
            count++;
            }
        }
        //Llena String para Salida en Pantalla
        for (int i=0;i<arrayA.length+arrayB.length;i++)
            if (result[i]!=null)
            _Cadena=_Cadena+result[i]+";";
        return _Cadena; 
    }
}
