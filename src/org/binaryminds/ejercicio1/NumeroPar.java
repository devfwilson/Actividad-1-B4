package org.binaryminds.ejercicio1;

import java.util.Scanner;

public class NumeroPar {

    Scanner scanner = new Scanner(System.in);

    public NumeroPar () {
        System.out.print("\nIngrese un número: ");
        int numero = scanner.nextInt();
        comprobarNumeroPar(numero);
    }

    public void comprobarNumeroPar(int numero){
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }
    }
}