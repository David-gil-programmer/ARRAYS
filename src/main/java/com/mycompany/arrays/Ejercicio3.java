/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // creamos array de 20
        double[] arrayDouble = new double[20];

        // todos los espacios serán ocupados por 7.5
        Arrays.fill(arrayDouble, 7.5);
        //Arrays.fill(arrayDouble, new Persona)--> la persona rellena todos los espacios

        //bucle para mostrar los valores del array
        for (int i = 0; i < arrayDouble.length; i++) {

            System.out.print(arrayDouble[i] + "-");

        }
        
        System.out.println(Arrays.toString(arrayDouble));
        //método de copia
        double[] arrayDoubleCop = Arrays.copyOf(arrayDouble, arrayDouble.length);

        //bucle para mostrar los valores (en este caso en vertical)
        for (int i = 0; i < arrayDoubleCop.length; i++) {
            System.out.println(arrayDoubleCop[i] + "-");
        
        //if de comparar arrays
        System.out.println(Arrays.compare(arrayDouble, arrayDoubleCop));
        if (/*arrayDoubleCop == arrayDouble*/arrayDoubleCop[i] == arrayDouble[i]/*Devuleve 0,1 o -1*/) {//Alias
            System.out.println("Son iguales");//para que se tenga que usar el equals se necesita tener implementado equals en objeto
        } else {
            System.out.println("No son iguales");
        }
        }
        // numero aleatorio
        Random aleatorio = new Random();
        // numero aleatorio será el espacio que ocupará 6.3
        int num = aleatorio.nextInt(arrayDoubleCop.length);

        arrayDoubleCop[num] = 6.3;

        //se vuelven a mostrar y a comparar
        for (int i = 0; i < arrayDouble.length; i++) {

            System.out.print(arrayDouble[i] + "-");

        }
        for (int i = 0; i < arrayDoubleCop.length; i++) {
            System.out.println(arrayDoubleCop[i] + "-");
        }
        if (arrayDoubleCop == arrayDouble) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

}
