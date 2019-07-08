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
public class Principal {
    public static void main(String[] args) {
        // Declaración de array 
        int [] arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        // LLamamiento al metodo obtenerTamanioArreglo 
        // Por Método recursivo
        int suma_arreglo = paquetesecundario4.TamanioArreglo.
                obtenerTamanioArreglo(arreglo, arreglo.length);
        // Impresion del mensaje con el valor obtenida del método
        System.out.printf("La suma del arreglo por metodo recursivo "
                + "es de: %d\n", suma_arreglo);
        
        // Por bucle 
        // Llamamiento al metodo obtenerTamanioPorBucle
        int suma_bucle = paquetesecundario4.TamanioArreglo.
                obtenerTamanioPorBucle(arreglo, arreglo.length);
        // Impresion del mensaje con el valor obtenido del método 
        System.out.printf("La suma del arreglo por bucle es de %d\n",
                suma_bucle);
        
    }
}
