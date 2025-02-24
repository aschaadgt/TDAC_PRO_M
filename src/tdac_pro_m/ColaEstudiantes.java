package tdac_pro_m;

// Clase ColaEstudiantes: maneja la estructura de la cola
class ColaEstudiantes {
    private NodoC cabeza;
    private NodoC ultimo;
    private int contador;

    public ColaEstudiantes() {
        this.cabeza = null;
        this.ultimo = null;
        this.contador = 0;
    }

    // Método para insertar en la cola
    public void insertar(Estudiante estudiante) {
        NodoC nuevo = new NodoC(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        contador++;
    }

    // Método para extraer (eliminar) el primer elemento de la cola
    public void extraer() {
        if (cabeza == null) {
            System.out.println("La cola está vacía, no hay nada que eliminar.");
            return;
        }
        System.out.println("Eliminando: " + cabeza.estudiante.getInfo());
        cabeza = cabeza.siguiente;
        if (cabeza == null) {
            ultimo = null;
        }
        contador--;
    }

    // Método para mostrar todos los estudiantes en la cola
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        NodoC temp = cabeza;
        int indice = 1;
        while (temp != null) {
            System.out.println(indice + ". " + temp.estudiante.getInfo());
            temp = temp.siguiente;
            indice++;
        }
    }

    // Método para buscar un estudiante por posición y medir el tiempo de búsqueda
    public void buscarEstudiante(int posicion) {
        if (posicion < 1 || posicion > contador) {
            System.out.println("Posición inválida.");
            return;
        }

        long startTime = System.nanoTime();
        NodoC temp = cabeza;
        int indice = 1;

        while (temp != null && indice < posicion) {
            temp = temp.siguiente;
            indice++;
        }

        long endTime = System.nanoTime();
        long tiempoEjecucion = (endTime - startTime) / 1000000; // Convertir a milisegundos

        if (temp != null) {
            System.out.println("Estudiante encontrado: " + temp.estudiante.getInfo());
            System.out.println("Tiempo de búsqueda: " + tiempoEjecucion + " ms");
        }
    }
}
