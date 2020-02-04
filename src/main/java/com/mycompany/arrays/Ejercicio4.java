/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio4 {

    public static void main(String[] args) {
    // se crea el array
        int[] arrayEntero = new int[10];
        int valor = 4;
        
        rellenar(arrayEntero);


    }
    
        public static void rellenar(int[] arrayEntero){
            Random aleatorio = new Random();
            for(int i = 0; i<arrayEntero.length; i++){
                arrayEntero[i] = aleatorio.nextInt(4)+1;
            }
            
        }
        public static int buscarNumero(int[] array, int numero){
            for(int i = 0; i<array.length; i++){
                if(array[i] == numero){
                    return i;
                }
            }
            
        }
}
