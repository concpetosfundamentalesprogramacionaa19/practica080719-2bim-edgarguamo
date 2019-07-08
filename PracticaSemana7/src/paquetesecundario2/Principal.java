/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesecundario2;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String[] args) {
        int valor =5;
        int suma = SumaNumeros.obtenerSumaUno(valor);
        System.out.printf("Suma2 %ds\n", suma);
        
        int suma2 = SumaNumeros.obtenerSumaDos(valor);
        System.out.printf("Suma2 %ds\n", suma);
    }
}
