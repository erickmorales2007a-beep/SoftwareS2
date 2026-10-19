public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo1.nombre = "Router";
        dispositivo1.tipo = "Redes";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Impresora";
        dispositivo2.tipo = "Periférico";
        dispositivo2.activo = false;

        System.out.println("--- Información del Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println("\n--- Información del Dispositivo 2 ---");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        dispositivo1.activo = false;

        System.out.println("\n--- Después de modificar el Dispositivo 1 ---");
        dispositivo1.mostrarInformacion();
        dispositivo2.mostrarInformacion();

        }
    }
}