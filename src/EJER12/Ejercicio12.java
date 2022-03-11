/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER12;

/**
 *
 * @author yago5
 */
public class Ejercicio12 {

    static int contadorvocales(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int vocales = contadorvocales("cadena de caracteres");
        System.out.println("Hay " + vocales + " vocales");
    }
}
