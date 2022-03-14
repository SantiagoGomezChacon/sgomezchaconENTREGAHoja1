/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER13;

/**
 *
 * @author yago5
 */
public class Ejercicio13 {

    static String invertircadena(String frase) {
        String cadenainvertida = "";
        char letra = ' ';
        for (int i = frase.length() - 1; i > -1; i--) {
            letra = frase.charAt(i);
            cadenainvertida = cadenainvertida + letra;
        }
        return cadenainvertida;
    }

    public static void main(String[] args) {
        String cadena = "cadena de caracteres";
        String CadenaInvertida = invertircadena(cadena);
        System.out.println(CadenaInvertida);
    }
}
