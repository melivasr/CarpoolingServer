package server.model.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que representa al usuario
 */
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String correo;
    private String tipo;

    private String ubicacion;
    private String password;
    private String calificacion;

    /**
     * Constructor generico
     */
    public Usuario() {
    }

    /**
     * Metodo que obtiene el identificador del usuario
     * @return identificador asociado
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo pata establecer el identificador del usuario
     * @param id identificador del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que obtiene el nombre del usuario
     * @return nombre asociado
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para establecer el nombre del usuario
     * @param name nombre del usuario
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que obtiene el correo del usuario
     * @return correo asociado
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para establecer el correo del usuario
     * @param correo correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo que obtiene el tipo de usuario
     * @return tipo asociado al usuario
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo para establecer que tipo es el usuario
     * @param tipo tipo del usuario
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que obtiene la ubicacion del usuario
     * @return ubicacion asociada
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Metodo para establecer la ubicacion del usuario
     * @param ubicacion ubicacion del usuario
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Metodo que obtiene la contrasena del usuario
     * @return contrasena asociada
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo para establecer la contrasena del usuario
     * @param password contrasena del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo que obtiene la calificacion del usuario
     * @return calificacion asociada
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Metodo para establecer la calificacion del usuario
     * @param calificacion calificacion del usuario
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Metodo que convierte los datos del usuario en un String
     * @return String con los datos del usuario
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", correo='" + correo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", password='" + password + '\'' +
                ", ubicacion='" + ubicacion + '\''+
                ", calificacion='" + calificacion + '\''+
                '}';
    }
}
