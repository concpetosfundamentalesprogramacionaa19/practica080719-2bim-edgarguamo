/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesecundario3;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 4;
        int resultado = paquetesecundario3.
                Potencia.get_potencia(base, exponente);
        System.out.printf("El resultado de la potencia es: %d\n", resultado);
    }
    
}
