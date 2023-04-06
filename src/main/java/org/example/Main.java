package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lanzar();
    }

    public static String quitarCaracteresNoDeseados(String cadena) {
        cadena = cadena.replace(" ", "").replace(".","").replace(",","")
                .replace("á","a").replace("é","e").replace("í","i")
                .replace("ó","o").replace("ú","u").replace(":","")
                .replace("\n","").replace("'","");
        return cadena;
    }

    public static String cambiarMayusculasAMinusculas(String cadena){
        return cadena.toLowerCase();
    }

    public static boolean verificarSoloContLetras(String cadena){
        boolean contSoloLetras = true;
        for (int cont=0;cont<cadena.length();cont++){
            if ((cadena.charAt(cont) < 'a' || cadena.charAt(cont) > 'z')&& cadena.charAt(cont)!='ñ') {
                contSoloLetras = false;
                break;
            }
        }
        return contSoloLetras;
    }

    public static boolean verificarPalindromo(String cadena){
        if (cadena.isEmpty()){
            return false;
        }
        boolean esPalindromo = true;
        int valorCaracterFinal = cadena.length()-1;
        int caracterActual = 0;
        while (caracterActual<valorCaracterFinal){
            if (cadena.charAt(caracterActual) != cadena.charAt(valorCaracterFinal)) {
                esPalindromo = false;
                break;
            }
            caracterActual++;
            valorCaracterFinal--;
        }
        return esPalindromo;
    }
    public static void lanzar(){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la palabra a evaluar si es palindromo");
        String cadena = in.nextLine();
        cadena = quitarCaracteresNoDeseados(cambiarMayusculasAMinusculas(cadena));
        while (!verificarSoloContLetras(cadena)){
            System.out.println("su ingreso contiene algun caracter que no es una letra");
            cadena = quitarCaracteresNoDeseados(cambiarMayusculasAMinusculas(in.nextLine()));
        }
        System.out.println(cadena);
        if (!verificarPalindromo(cadena)){
            System.out.println("su cadena no es un palindromo");
        }else {
            System.out.println("su palabra es un palindromo");
        }
    }
}