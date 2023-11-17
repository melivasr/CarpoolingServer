package server.model.amigoViaje;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que maneja datos relacionados a amigos en viaje
 */
@Entity
public class AmigoViaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String correo;
    private String ubicacion;

    /**
     * Constructor generico
     */
    public AmigoViaje() {
    }

    /**
     * Metodo que obtiene el identificador
     * @return identificador
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para establecer el correo
     * @param correo correo electronico correspondiente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo que obtiene el correo
     * @return correo asociado
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo que obtiene la ubicacion
     * @return ubicacion asociada
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Metodo para establecer una ubicacion
     * @param ubicacion ubicacion correspondiente
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Metodo que convierte la informacion del amigo en viaje a un String
     * @return String con la informacion del amigo en viaje
     */
    @Override
    public String toString() {
        return "Amigo{" +
                ", correo='" + correo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
