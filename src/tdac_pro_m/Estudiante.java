package tdac_pro_m;

// Clase Estudiante: contiene la información de un estudiante
class Estudiante {
    String carnet;
    String nombre;
    String direccion;
    String telefono;
    String correo;
    String genero;

    public Estudiante(String carnet, String nombre, String direccion, String telefono, String correo, String genero) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.genero = genero;
    }

    public String getInfo() {
        return "Carnet: " + carnet + ", Nombre: " + nombre + ", Dirección: " + direccion + 
               ", Teléfono: " + telefono + ", Correo: " + correo + ", Género: " + genero;
    }
}
