package server.model.distanceData;

import server.model.geographicData.GeographicData;
import jakarta.persistence.*;

/**
 * Clase que maneja los datos relacionados a la distancia geografica
 */
@Entity
public class GeographicDistanceData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @ManyToOne
    @JoinColumn(name = "originId", referencedColumnName = "id")
    private GeographicData origin;

    @ManyToOne
    @JoinColumn(name = "destinationId", referencedColumnName = "id")
    private GeographicData destination;

    private double distance;

    private double time;

    /**
     * Constructor generico
     */
    public GeographicDistanceData() {}

    /**
     * Metodo para obtener un identificador
     * @return identificador
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para establecer un identificador
     * @param id identificador de la informacion geografica
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el origen de datos geograficos
     * @return origen solicitado
     */
    public GeographicData getOrigin() {
        return origin;
    }

    /**
     * Metodo para establecer el origen de datos geograficos
     * @param origin origen de los datos geograficos
     */
    public void setOrigin(GeographicData origin) {
        this.origin = origin;
    }

    /**
     * Metodo para obtener el destino de datos geograficos
     * @return destino solicitado
     */
    public GeographicData getDestination() {
        return destination;
    }

    /**
     * Metodo para establecer el destino de datos geograficos
     * @param destination destino de los datos geograficos
     */
    public void setDestination(GeographicData destination) {
        this.destination = destination;
    }

    /**
     * Metodo para obtener la distancia geografica
     * @return distancia geografica
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Metodo para establecer la distancia geografica
     * @param distance distancia geografica
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Metodo para obtener el tiempo de la distancia geografica
     * @return tiempo asociado
     */
    public double getTime() {
        return time;
    }

    /**
     * Metodo para establecer el tiempo de la distancia geografica
     * @param time tiempo asociado
     */
    public void setTime(double time) {
        this.time = time;
    }
}
