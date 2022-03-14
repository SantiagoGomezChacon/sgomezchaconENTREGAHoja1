/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER6;

/**
 *
 * @author yago5
 */
public class Ejercicio6 {

    static boolean esprimo(int numero) {
        int resto;
        int contador = 0;
        for (int b = numero - 1; b > 1; b--) {
            resto = numero % b;
            if (resto == 0) {
                contador++;
                break;
            }
        }
        return contador == 0;
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 1001) {
            if (esprimo(i)) {
                System.out.println("El numero " + i + " es primo");

            }
            i++;
        }
    }

}
