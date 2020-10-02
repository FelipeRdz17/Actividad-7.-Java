package com.company;

import java.util.Scanner;

public class getNumero {
    public int numero;

    //Obtener numero
    public static int getN(int n) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Bienvenido al sistema de números primos y serie de fibonachi. ");
        System.out.println("Ingresa un número entero positivo: ");
        numero = input.nextInt();
        return numero;
    }
}
