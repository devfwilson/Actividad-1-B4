package org.binaryminds.ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {

    Scanner scanner = new Scanner(System.in);

    public AdivinarNumero() {
        System.out.print("\nIngrese un número: ");
        int numero = scanner.nextInt();
        comprobarSiCoincide(numero);
    }

    public void comprobarSiCoincide(int numero) {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(10) + 1;

        if (numero == numeroAleatorio) {
            System.out.println("Muy bien, el número era " + numeroAleatorio);
        } else {
            System.out.println("Incorrecto, el número era " + numeroAleatorio);
        }
    }
}
