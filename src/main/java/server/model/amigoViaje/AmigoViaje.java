package server.model.amigoViaje;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AmigoViaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String correo;
    private String ubicacion;


    public AmigoViaje() {
    }

    public int getId() {
        return id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                ", correo='" + correo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
