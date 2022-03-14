/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yago5
 */
public class EJER14 {

    public static void main(String[] args) {
        String cadena = "dábale arroz a la zorra el abad";
        String CadenaInvertida = InvertirCadena(cadena);
        String CadenaNormal = CadenaNormal(cadena);
        if (CadenaInvertida.equals(CadenaNormal)) {
            System.out.println("La cadena es palindroma");
        } else {
            System.out.println("La cadena no es palindroma");
        }
    }

    public static String InvertirCadena(String cadena) {
        String CadenaInvertida = "";
        for (int i = cadena.length() - 1; i > -1; i--) {
            CadenaInvertida = CadenaInvertida + cadena.charAt(i);
        }
        String CadenaInvertidaSinEspacios = CadenaInvertida.replace(" ", "");
        String CadenaInveridaSinEspaciossinAcentos = CadenaInvertidaSinEspacios.replace('á', 'a').replace('é', 'e').replace('ì', 'i').replace('ò', 'ò').replace('ù', 'u');
        return CadenaInveridaSinEspaciossinAcentos;
    }

    public static String CadenaNormal(String cadena) {
        String Cadena = cadena;
        String CadenaSinEspaciosAcentos = "";
        CadenaSinEspaciosAcentos = Cadena.replace('á', 'a').replace('é', 'e').replace('ì', 'i').replace('ò', 'ò').replace('ù', 'u').replace(" ", "");
        CadenaSinEspaciosAcentos = CadenaSinEspaciosAcentos;
        return CadenaSinEspaciosAcentos;
    }
}
