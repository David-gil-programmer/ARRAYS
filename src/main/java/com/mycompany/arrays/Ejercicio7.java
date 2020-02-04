/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author david
 */
public class Ejercicio7 {

    // programa que lea del teclado el tamaño de dos arrays de enteros 
    //(el mismo tamaño para los dos arrays).
    public static void main(String[] args) {
        int tamanio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Muestre el tamaño de los array:");
        tamanio = teclado.nextInt();
        int[] arrayInt = new int[tamanio];

        //El programa inicializará los arrays con números aleatorios entre 1 y 100.
        for (int i = 0; i < arrayInt.length; i++) {
            Random aleatorio = new Random();
            int numero = aleatorio.nextInt();

        }

    }

    /*public static void rellenar(int[] array, int[] array2) {
        
    }*/
    public static int[] multiplicar(int[] array, int[] array2){
        int[] array3 = new int[array.length];
        for(int i = 0; i<array3.length; i++){
            array[1] = array[i] * array2[i];
        }
        return array3;
    }

}
