package org.binaryminds.ejercicio2;

import java.util.Scanner;

public class NumeroPrimo {

    Scanner scanner = new Scanner(System.in);

    public NumeroPrimo(){
        System.out.print("\nIngrese un número: ");
        int numero = scanner.nextInt();
        comprobarNumeroPrimo(numero);
    }

    public void comprobarNumeroPrimo(int numero) {
        int divisores = 0;
        for (int i = 1; i<numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores > 2) {
            System.out.println("El número no es primo");
        } else {
            System.out.println("El número es primo");
        }
    }
}
