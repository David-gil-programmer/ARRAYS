/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class Ejercicio6 {

    //Hacer un programa que dados dos arrays determine si son iguales.
    //Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2].
    public static void main(String[] args) {
        int[] arrayInt;

        int[] arrayInt1 = {1, 2, 3};
        int[] arrayInt2 = {1, 2, 3};
        int[] arrayInt3 = {1, 2, 3, 4};
        int[] arrayInt4 = {1, 2, 3};
        int[] arrayInt5 = {1, 2, 3};
        int[] arrayInt6 = {1, 2, 2};

        //usando la clase Arrays
        Arrays.compare(arrayInt1, arrayInt2);
        Arrays.compare(arrayInt3, arrayInt4);
        Arrays.compare(arrayInt5, arrayInt6);
        // creando un método que vaya comparando los valores de los arrays 
        //y devuelva true si todos son iguales o false en caso contrario.

    }

    public static boolean compara(int[] arrayInt) {
        boolean resultado;
        if (arrayInt.equals(arrayInt)) {
            return resultado = true;
        } else {
            return resultado = false;
        }
    }//REVISAR
}
