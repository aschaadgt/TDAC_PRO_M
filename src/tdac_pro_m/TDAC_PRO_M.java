package tdac_pro_m;

import java.util.Scanner;
import java.util.Random;

// Clase principal con menú
public class TDAC_PRO_M {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        ColaEstudiantes cola = new ColaEstudiantes();
        int opcion = -1; // ✅ Se inicializa para evitar el error

        do {
            limpiarPantalla();
            System.out.println("┌-----------------------┐");
            System.out.println("|   Menu de Estudiantes  |");
            System.out.println("└-----------------------┘\n");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar N estudiantes aleatorios");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Buscar registro");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            if (!input.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                input.next(); // Limpia la entrada inválida
                continue;
            }

            opcion = input.nextInt();
            input.nextLine(); // Consumir línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el carnet: ");
                    String carnet = input.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccion = input.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = input.nextLine();
                    System.out.print("Ingrese el correo: ");
                    String correo = input.nextLine();
                    System.out.print("Ingrese el género: ");
                    String genero = input.nextLine();

                    Estudiante nuevoEstudiante = new Estudiante(carnet, nombre, direccion, telefono, correo, genero);
                    cola.insertar(nuevoEstudiante);
                    System.out.println("Estudiante agregado correctamente.");
                    break;

                case 2:  // Agregar N estudiantes aleatorios
                    System.out.print("Ingrese la cantidad de estudiantes a generar: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Error: Ingrese un número válido.");
                        input.next();
                        break;
                    }
                    int cantidad = input.nextInt();
                    input.nextLine();
                    generarEstudiantesAleatorios(cola, cantidad);
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 4:
                    cola.extraer();
                    break;

                case 5:
                    System.out.print("Ingrese el número del estudiante a buscar: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Error: Ingrese un número válido.");
                        input.next();
                        break;
                    }
                    int numBuscar = input.nextInt();
                    input.nextLine();
                    cola.buscarEstudiante(numBuscar);
                    break;

                case 0:
                    System.out.println("\n...Saliendo del programa, ¡Gracias!");
                    break;

                default:
                    System.out.println("\nOpción Inválida. Intente de nuevo.");
            }

            if (opcion != 0) {
                System.out.print("Presione Enter para continuar...");
                input.nextLine();
            }
        } while (opcion != 0);

        input.close();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Método para generar N estudiantes aleatorios
    public static void generarEstudiantesAleatorios(ColaEstudiantes cola, int cantidad) {
        Random rand = new Random();
        String[] nombres = {"Juan", "Maria", "Carlos", "Ana", "Pedro", "Sofia", "Luis", "Fernanda"};
        String[] direcciones = {"Zona 1", "Zona 2", "Zona 3", "Zona 4", "Zona 5"};
        String[] generos = {"M", "F"};
        String[] correos = {"@gmail.com", "@hotmail.com", "@yahoo.com", "@outlook.com"};

        for (int i = 0; i < cantidad; i++) {
            String carnet = String.valueOf(rand.nextInt(100000));
            String nombre = nombres[rand.nextInt(nombres.length)];
            String direccion = direcciones[rand.nextInt(direcciones.length)];
            String telefono = "5" + rand.nextInt(9999999);
            String correo = nombre.toLowerCase() + correos[rand.nextInt(correos.length)];
            String genero = generos[rand.nextInt(generos.length)];

            Estudiante nuevo = new Estudiante(carnet, nombre, direccion, telefono, correo, genero);
            cola.insertar(nuevo);
        }
        System.out.println(cantidad + " estudiantes generados y añadidos a la cola.");
    }
}
