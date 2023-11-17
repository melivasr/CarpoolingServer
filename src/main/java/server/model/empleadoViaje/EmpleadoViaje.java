package server.model.empleadoViaje;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que representa un empleado en un viaje
 */
@Entity
public class EmpleadoViaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String correo;
    private String ubicacion;

    /**
     * Constructor generico
     */
    public EmpleadoViaje() {
    }

    /**
     * Metodo que obtiene la identificacion del empleado
     * @return identificador
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que establece el correo del empleado
     * @param correo correo asociado al empleado
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo que obtiene el correo del empleado
     * @return correro asociado
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo que obtiene la ubiacion actual del empleado
     * @return ubicacion del empleado
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Metodo que establece la ubicacion actual del emplado
     * @param ubicacion ubicacion de un empleado
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Metodo que retorna informacion del empleado como un String
     * @return String con informacion del empleado
     */
    @Override
    public String toString() {
        return "Employee{" +
                ", correo='" + correo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
