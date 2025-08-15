package org.binaryminds.ejercicio4;

import java.util.Scanner;

public class ConversionGrados {

    Scanner scanner = new Scanner(System.in);

    public ConversionGrados() {
        System.out.println("\n1 - Grados centígrados a Fahrenheit");
        System.out.println("2 - Fahrenheit a grados centígrados");
        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                gradosAFahrenheit();
                break;
            case 2:
                fahrenheitAGrados();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void fahrenheitAGrados() {
        System.out.print("Ingrese la cantidad de Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double centigrados = (fahrenheit-32) * 5/9;
        System.out.println(fahrenheit + "F equivalen a: " + centigrados + "°");
    }

    public void gradosAFahrenheit() {
        System.out.print("Ingrese la cantidad de grados centígrados: ");
        double centigrados = scanner.nextDouble();
        double fahrenheit = (centigrados * 9/5) +32;
        System.out.println(centigrados + "° equivalen a: " + fahrenheit + "F");
    }
}
