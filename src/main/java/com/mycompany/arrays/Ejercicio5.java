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
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;
        int sumaPosi = 0;
        int sumaNega = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        //Implementa un programa que guarde en un array 10 números enteros que se leen por teclado.
        int[] arrayInt = new int[10];
        
        for(int i = 0; i<arrayInt.length; i++){
        // SE PIDE POR TECLADO LOS Nº
        System.out.println("Introduce el número");
        numero = teclado.nextInt();
        arrayInt[i] = numero;
        
        if(numero >0){
            positivo++;
            sumaPosi += arrayInt[i];
        }else if(numero <0){
            negativo++;
            sumaNega += arrayInt[i];
        }else{
            cero++;
        }
        
        }
        int mediaPosi = sumaPosi / positivo;
        int mediaNega = sumaNega / negativo;
        
        System.out.println("La media positiva es:"+mediaPosi);
        System.out.println("La media negativa es:"+mediaNega);
        
    }
    
}
