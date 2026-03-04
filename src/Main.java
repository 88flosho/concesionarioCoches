public class Main {
    public static void main(String[] args) {

        // Crear Concesionario con capacidad para 12 vehiculos
        Concesionario concesionario = new Concesionario(12);

        // Crear entrenadores
        vehiculo vehiculo1 = new vehiculo(1, "8829MWC", "Bmw", 32900.99);
        vehiculo vehiculo2 = new vehiculo(2, "9642HDP", "Audi", 22450.33);
        vehiculo vehiculo3 = new vehiculo(3, "0027KLK", "Seat", 12000.99);

        // Registrar al menos 3 entrenadores
        concesionario.addVehiculo(vehiculo1);
        concesionario.addVehiculo(vehiculo2);
        concesionario.addVehiculo(vehiculo3);

        // Mostrar entrenadores
        System.out.println("LISTADO DE VEHICULOS:");
        concesionario.obtainVehiculos();

        // Mostrar total almacenado
        System.out.println("\nTotal de vehiculos almacenados: "
                + concesionario.());

        // Probar búsqueda existente
        System.out.println("\nBúsqueda vehiculo con ID 1:");
        System.out.println(concesionario.findVehiculo(1));

        // Probar búsqueda inexistente
        System.out.println("\nBúsqueda vehiculo con ID 99:");
        System.out.println(concesionario.findVehiculo(99));
    }
}
