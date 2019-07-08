/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesecundario4;

/**
 *
 * @author Usuario iTC
 */
public class TamanioArreglo {
    // Método para obtener la suma del arreglo por Método recursivo 
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // Declaración incial 
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            // retorno de la variable 
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2,
                    tamanio - 1 ); 
        }
       
    }
    // Metodo para obtener la suma del arreglo por bucle 
    public static int obtenerTamanioPorBucle(int arreglo[], int tamanio){
        int suma_bucle = 0;
        // Ciclo for 
        for (int i = 0; i < arreglo.length; i++) {
            suma_bucle = suma_bucle + arreglo [i];
        }
        // retorno de la variable
        return suma_bucle;
    }
}
