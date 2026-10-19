public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }
    void mostrarEstado() {
        System.out.println("Estado activo: " + activo);

    }
    public void activar() {
        activo = true;
        System.out.println("El dispositivo " + nombre + " ha sido activado.");}
}