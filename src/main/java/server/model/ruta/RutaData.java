package server.model.ruta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Clase que maneja rutas
 */
@Entity
public class RutaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String ruta;

    /**
     * Constructor generico
     */
    public RutaData() {
    }

    /**
     * Metodo que obtiene el identificador de una ruta
     * @return identificador asociado
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que obtiene una ruta
     * @return ruta solicitada
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Metodo que establece una ruta
     * @param ruta ruta establecida
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Metodo que retorna informacion de una ruta como un String
     * @return String con la informacion de la ruta
     */
    @Override
    public String toString() {
        return "Employee{" +
                ", ruta='" + ruta + '\'' +
                '}';
    }
}
