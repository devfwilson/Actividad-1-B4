import java.util.Scanner;
import org.binaryminds.ejercicio1.NumeroPar;
import org.binaryminds.ejercicio2.NumeroPrimo;
import org.binaryminds.ejercicio3.AdivinarNumero;
import org.binaryminds.ejercicio4.ConversionGrados;
import org.binaryminds.ejercicio5.AdministradorDeTareas;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Bienvenido al menú");
        System.out.println("-------------------");

        int opcion;

        do {
            System.out.println("\n1 - Comprobar número par");
            System.out.println("2 - Comprobar número primo");
            System.out.println("3 - Adivinar número aleatorio");
            System.out.println("4 - Conversión de grados");
            System.out.println("5 - Organizar tareas");
            //System.out.println("6 - Administrar agenda de contactos");
            System.out.println("0 - Terminar ejecución");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    NumeroPar numeroPar = new NumeroPar();
                    break;

                case 2:
                    NumeroPrimo numeroPrimo = new NumeroPrimo();
                    break;

                case 3:
                    AdivinarNumero adivinarNumero = new AdivinarNumero();
                    break;

                case 4:
                    ConversionGrados conversionGrados = new ConversionGrados();
                    break;

                case 5:
                    AdministradorDeTareas administradorDeTareas = new AdministradorDeTareas();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion!=0);
    }
}