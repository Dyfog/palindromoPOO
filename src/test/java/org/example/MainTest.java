package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String cadenaCnCaracterNoDeseado;
    String cadenaCnMayusculas;
    String cadenaCnSoloLetras;
    String cadenaQueNoContSoloLetras;
    String cadenaEsPalindromo;
    String cadenaNoEsPalindromo;
    String cadenaVacia;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cadenaCnCaracterNoDeseado = "., ábc cba ,.";
        cadenaCnMayusculas = "AbCdEf";
        cadenaCnSoloLetras = "abcdefghi";
        cadenaQueNoContSoloLetras = "1abc";
        cadenaEsPalindromo = "abcdcba";
        cadenaNoEsPalindromo = "aabccba";
        cadenaVacia = "";
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void quitarCaracteresNoDeseados() {
        String cadenaEsperada = Main.quitarCaracteresNoDeseados(cadenaCnCaracterNoDeseado);
        assertEquals("abccba",cadenaEsperada);
    }

    @org.junit.jupiter.api.Test
    void cambiarMayusculasAMinusculas() {
        String cadenaEsperada = Main.cambiarMayusculasAMinusculas(cadenaCnMayusculas);
        assertEquals("abcdef",cadenaEsperada);
    }

    @org.junit.jupiter.api.Test
    //este metodo solo recibira cadenas con solo letras minusculas o cadenas vacias
    void verificarSoloContLetras() {
        boolean soloContLetras = Main.verificarSoloContLetras(cadenaCnSoloLetras);
        assertTrue(soloContLetras);

        boolean soloContLetras1 = Main.verificarSoloContLetras(cadenaQueNoContSoloLetras);
        assertFalse(soloContLetras1);
    }

    @org.junit.jupiter.api.Test
    //a este metodo solo llegan cadenas solo con letras
    void verificarPalindromo() {
        boolean palindromo1 = Main.verificarPalindromo(cadenaEsPalindromo);
        assertTrue(palindromo1);

        boolean palindromo2 = Main.verificarPalindromo(cadenaNoEsPalindromo);
        assertFalse(palindromo2);

        boolean palindromo3 = Main.verificarPalindromo(cadenaVacia);
        assertFalse(palindromo3);
    }
}