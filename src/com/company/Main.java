package com.company;

import java.util.Scanner;


public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

       int numero;

                System.out.println("Bienvenido al sistema de números primos y serie de fibonachi. ");
                System.out.println("Ingresa un número entero positivo: ");
                numero = input.nextInt();

        while (true) {
            if (numero > 0) {
                System.out.println("Los siquientes son los resultados:");
                System.out.println("Números primos:");
                for (int i = 2; i <= numero; i++) {
                    int crecimiento = 2;
                    boolean validarPrimo = true;

                    while (validarPrimo && crecimiento < i) {

                        if (i % crecimiento == 0) {
                            validarPrimo = false;
                        } else {
                            crecimiento++;
                        }
                    }

                    if (validarPrimo) {
                        System.out.print(i + ", ");
                    }
                }

                {
                    break;
                }

            }

            else {
                System.out.println("Número incorrecto, ingresa otro.");
            }

        }

        int numero1 = 0;
        int numero2 = 1;
        int temp;
        int limite = 50000;
        System.out.println(" ");
        System.out.println("Serie Fibonacci:");
        System.out.print(numero1 + ", ");
        System.out.print(numero2 + ", ");

        while(numero2 + numero1 <= numero){
            temp = numero1;
            numero1 = numero2;
            numero2 = temp + numero1;
            System.out.print(numero2 +", ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Felipe Rodríguez");
        System.out.println("2795588");
        System.out.println("Actividad 8. Computación en Java");



}
}