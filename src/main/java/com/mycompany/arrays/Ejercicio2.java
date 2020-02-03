/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        //atributos
        int altura;
        int personas;
        int media;
        int suma = 0;
        int contMa = 0;
        int contMe = 0;
        
        //creo el scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de persona");
        personas = teclado.nextInt();

        // creamos array de tipo int --> y le introducimos los datos del nº de personas
        int[] arrayInt = new int[personas];

        // for con aumento de i va aumentando por cada espacio del Array 
        for (int i = 0; i < arrayInt.length; i++) {

            System.out.println("Introduce la altura de la persona:");
            altura = teclado.nextInt();

            // en caso de que la altura sea negativo se pondrá en positivo
            altura = Math.abs(altura);
            suma += altura;
            // la altura en la posición i es introducida en el Array 
            arrayInt[i] = altura;
        }
        // media de alturas
        media = suma / arrayInt.length;
        System.out.println("La media es " + media);
        // bucle para mostrar cada espacio del array
        for (int i = 0; i < arrayInt.length; i++) {
            // si el nº del array es inferior a la media
            if (arrayInt[i] < media) {
                System.out.println("La persona " + i + " es inferior a la media");
                contMe++;
            }
            // si el nº del array es superior a la media
            if (arrayInt[i] > media) {
                System.out.println("La persona " + i + " es superior a la media");
                contMa++;
            }

        }

        // imprimir resultados
        System.out.println("Hay " + contMa + " personas superiores a la media");
        System.out.println("Hay " + contMe + " personas inferiores a la media");

    }
    /*private static int calcularMedia(int[] array){
    for(int = 0; i<array.lenght; i++){
    suma += array[i];
    }
    return suma/array.lenght;
    */ 

}
