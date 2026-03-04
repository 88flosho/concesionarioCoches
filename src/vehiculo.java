/**
 * Representa un vehiculo dentro del catálogo de un concesionario.
 *
 * Cada vehiculo está identificado de manera única mediante un {@code id}
 * y contiene información básica como matricula, marca y precio.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
 * @author Alejandro Ernesto
 * @version 1.0
 */
public class vehiculo {

    // atributos de la clase
    private int id;
    private String matricula;
    private String marca;
    private double precio;

    /**
     * Metodo constructor de objetos tipo {@code vehiculo}
     * @param id identificador del vehiculo
     * @param matricula matricula del vehiculo
     * @param marca del vehiculo
     * @param precio coste total del vehiculo
     */
    public vehiculo(int id, String matricula, String marca, double precio){  // parámetros del metodo
        double costeTotal;  // variable del metodo

        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.precio = precio;

        costeTotal = precio;
    }

    /**
     * Devuelve el id del vehiculo
     * @return id del vehiculo
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve la matricula del vehiculo
     * @return la matricula del vehiculo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Devuelve la marca del vehiculo
     * @return la marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Devuelve el coste total del vehiculo
     * @return el coste total del vehiculo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve una representación textual del vehiculo con todos sus atributos.
     *
     * @return cadena de texto formateada con la información del vehiculo.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("vehiculo: {");

        sb.append(String.format("\n id: %d;", id));
        sb.append(String.format(" titulo: %s;", matricula));
        sb.append(String.format(" autor: %s;", marca));
        sb.append(String.format(" num. páginas: %d;", precio));
        sb.append("}");

        return sb.toString();
    }

    /**
     * Actualiza el coste que tiene el vehiculo. Comprueba que el número recibido sea mayor que 0
     * @param precio nuevo coste
     * @return true si ha podido cambiarse, false si no ha podido cambiarse
     */
    public boolean updatePrecio(double precio) {
        boolean resultado;

        if( precio <= 0 ){
            resultado = false;
        } else {
            this.precio = precio;
            resultado = true;
        }
        return resultado;
    }
}