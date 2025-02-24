package tdac_pro_m;

// Clase NodoC: representa un nodo en la cola de estudiantes
class NodoC {
    Estudiante estudiante;
    NodoC siguiente;

    public NodoC(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}
