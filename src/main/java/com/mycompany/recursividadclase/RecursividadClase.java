/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadclase;

/**
 *
 * @author nenin
 */
public class RecursividadClase {

    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    public static String invertir(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return invertir(s.substring(1)) + s.charAt(0);
    }

    public static int contarDigitos(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Suma de 1 hasta 5: " + suma(5));
        System.out.println("Invertir \"Murcielago\": " + invertir("Murcielago"));
        System.out.println("Digitos de 78951: " + contarDigitos(78951));
    }
}
