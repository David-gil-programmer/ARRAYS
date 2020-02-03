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
public class Ejercicio1 {

    public static void main(String[] args) {
        //Escribe un programa que muestre cada elemento de un array de enteros 
        //y sume todos sus elementos.
        //Instancia e inicializa el array en el programa, sin leer nada por teclado,
        //con los siguientes valores {1, 2, 3, 4, 5, 6}.

        //1ª POSIBILIDAD
        int arrayInt[] = {1, 2, 3, 4, 5, 6};
        
        //(forma más habitual de hacerlo)
        // declaración
        long array[];
        //instanciación
        array= new long[]{2};
        int suma = 0;
        // si se intenta instanciar con una clase(objeto), apuntará a null
        // p[i] = new Persona("Persona"+ (i+1));
        
        // se muestra valor aleatorio ;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + "-");
            suma += arrayInt[i];
        }
        
        System.out.println(" El valor de la suma es:" + suma);
        
        //2ª POSIBILIDAD
        //comnstruir un foreanch --> para leerlo
        for (int aux : arrayInt){
            System.out.println(aux); 
            suma += aux;
            System.out.println("El valor de la suma es:"+suma);
        }

    }

}
