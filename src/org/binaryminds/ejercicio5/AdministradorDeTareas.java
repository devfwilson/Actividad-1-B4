package org.binaryminds.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class AdministradorDeTareas {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tareas = new ArrayList<>();
    private int opcion;

    public AdministradorDeTareas() {
        do {
            System.out.println("\n1 - Ver tareas");
            System.out.println("2 - Agregar tarea");
            System.out.println("3 - Editar tarea");
            System.out.println("4 - Eliminar tarea");
            System.out.println("0 - Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    if (tareas.isEmpty()) {
                        System.out.println("\nNo se han agregado tareas");
                    } else {
                        int contador = 1;
                        System.out.println("\nTareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(contador + ". - " + tareas.get(i) + "");
                            contador++;
                        }
                    }
                    break;
                case 2:
                    System.out.print("\nIngrese la tarea que desea agregar: ");
                    scanner.nextLine();
                    String tarea = scanner.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada correctamente");
                    break;
                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("\nNo se han agregado tareas");
                    } else {
                        int contador = 1;
                        System.out.println("\nTareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(contador + ". - " + tareas.get(i));
                            contador++;
                        }
                        System.out.print("Ingrese el numero de la tarea que desee editar: ");
                        scanner.nextLine();
                        int numeroTarea = scanner.nextInt() - 1;

                        System.out.print("Ingrese el nuevo contenido de la tarea '" + tareas.get(numeroTarea) + "': ");
                        scanner.nextLine();
                        String nuevaTarea = scanner.nextLine();
                        tareas.set(numeroTarea, nuevaTarea);
                        System.out.println("Tarea editada correctamente");
                    }
                    break;
                case 4:
                    if (tareas.isEmpty()) {
                        System.out.println("\nNo se han agregado tareas");
                    } else {
                        int contador = 1;
                        System.out.println("\nTareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(contador + ". - " + tareas.get(i));
                            contador++;
                        }
                        System.out.print("Ingrese el numero de la tarea que desee eliminar: ");
                        scanner.nextLine();
                        int numeroTarea = scanner.nextInt() - 1;
                        tareas.remove(numeroTarea);
                        System.out.println("Tarea eliminada correctamente");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }
}
