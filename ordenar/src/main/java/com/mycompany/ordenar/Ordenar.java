/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenar;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ordenar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Por favor ingrese los 5 numeros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        
    }
}
