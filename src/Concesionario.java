/**
 * Representa un concesionario que gestiona un catálogo de vehiculos mediante
 * un array unidimensional de tamaño fijo.
 *
 * El concesionario permite:
 * <ul>
 *     <li>Registrar vehiculos sin duplicar identificadores.</li>
 *     <li>Buscar vehiculos por su identificador.</li>
 *     <li>Eliminar vehiculos existentes.</li>
 *     <li>Actualizar el coste del vehiculos.</li>
 *     <li>Obtener una representación textual del catálogo.</li>
 * </ul>
 *
 * La estructura interna utiliza un array estático donde las posiciones
 * libres se representan mediante valores {@code null}.
 *
 * @author Alejandro Ernesto Hernandez
 * @version 1.0
 */
public class Concesionario {

    private vehiculo[] vehiculos;
    private final int NUM_MAX_VEHICULOS;

    /**
     * Construye un concesionario con una capacidad máxima determinada.
     *
     * @param cantidad_maxima_vehiculos número máximo de vehiculos que puede almacenar el concesionario.
     */
    public Concesionario(int cantidad_maxima_vehiculos){
        NUM_MAX_VEHICULOS = cantidad_maxima_vehiculos;
        vehiculos = new vehiculo[NUM_MAX_VEHICULOS];

    }

    /**
     * Busca el primer vehiculos que encuentre con el id recibido
     * @param idVehiculo
     *  @return el objeto {@link vehiculo} si se encuentra en el catálogo;
     *         {@code null} en caso contrario.
     */
    public vehiculo findVehiculo(int idVehiculo){
        boolean seguirBuscando = true;
        vehiculo vehiculoEncontrado = null;

        for (int i = 0; i < NUM_MAX_VEHICULOS && seguirBuscando; i++) {
            if( vehiculos[i] != null && vehiculos[i].getId() == idVehiculo ){
                seguirBuscando = false;
                vehiculoEncontrado = vehiculos[i];
            }
        }

        return vehiculoEncontrado;
    }

    /**
     * Busca la primera posición libre (valor {@code null}) dentro del catálogo.
     *
     * @return el índice de la primera posición libre si existe;
     *         {@code -1} si el catálogo está completo.
     */
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_VEHICULOS && seguirBuscando; i++) {
            if( vehiculos[i] == null ){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }

        return posicionLibre;
    }

    /**
     * Añade un vehiculo al catálogo si no existe otro con el mismo identificador
     * y si hay espacio disponible.
     *
     * @param vehiculo vehiculo que se desea añadir.
     * @return {@code true} si el vehiculo se ha añadido correctamente;
     *         {@code false} si ya existía o no hay espacio disponible.
     */
    public boolean addVehiculo(vehiculo vehiculo){
        boolean vehiculoAnadido = false;
        int posicion;

        // comprobamos si existe
        // buscar hueco
        // no hay -> vehiculoAnadido = false
        // si hay ->
        // añadimos
        // vehiculoAnadido = true

        if( findVehiculo(vehiculo.getId()) == null ) {  // no lo ha encontrado. no está duplicado
            posicion = buscarPrimerHuecoLibre();
            if(posicion >= 0) {
                vehiculos[posicion] = vehiculo;
                vehiculoAnadido = true;
            }
        }

        return vehiculoAnadido;
    }

    /**
     * Elimina del catálogo el vehiculo cuyo identificador coincida con el recibido.
     *
     * @param id identificador del vehiculo a eliminar.
     * @return el vehiculo eliminado si se encontraba en el catálogo;
     *         {@code null} si no existe ningún vehiculo con ese identificador.
     */
    public vehiculo deleteVehiculo(int id){
        vehiculo vehiculoEncontrado = null;
        boolean seguirBuscando = true;

        // comprobamos que existe. Necesitamos el vehiculo y la posición

        for (int i = 0; i < NUM_MAX_VEHICULOS && seguirBuscando; i++) {
            if (vehiculos[i] != null && vehiculos[i].getId() == id) {
                vehiculoEncontrado = vehiculos[i];  // guardo el vehiculo
                vehiculos[i] = null;             // vaciamos la posición
                seguirBuscando = false;         // para que no siga recorriendo
            }
        }

        return vehiculoEncontrado;
    }


    /**
     * Actualiza el coste del vehiculo con el identificador indicado.
     *
     * @param idVehiculo identificador del vehiculo a actualizar.
     * @param precio nuevo coste del vehiculo.
     * @return {@code true} si el vehiculo existe y se ha actualizado correctamente;
     *         {@code false} si el vehiculo no existe o la actualización no es válida.
     */
    public boolean updatePrecio(int idVehiculo, double precio){
        boolean precioActualizado = false;
        vehiculo vehiculo;

        vehiculo = findVehiculo(idVehiculo);

        if( vehiculo != null ){
            precioActualizado = vehiculo.updatePrecio(precio);
        }

        return precioActualizado;
    }

    /**
     * Devuelve una representación textual del catálogo completo.
     *
     * @return una cadena de texto con todos los libros almacenados.
     */
    public String obtainVehiculos(){
        StringBuilder sb = new StringBuilder("Catálogo de vehiculos: { ");

        for (int i = 0; i < NUM_MAX_VEHICULOS; i++) {
            if( vehiculos[i] != null ){
                sb.append( vehiculos[i].toString() );
            }
        }
        sb.append("\n}");

        return sb.toString();
    }

}
