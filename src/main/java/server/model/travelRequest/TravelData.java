package server.model.travelRequest;

import server.model.geographicData.GeographicData;
import java.util.*;

/**
 * Clase que maneja datos relacionados a viajes
 */
public class TravelData {
    List<GeographicData> nodes;
    double distance;
    double time;

    /**
     * Constructor de la clase
     */
    public TravelData() {
        this.nodes = nodes;
    }

    /**
     * Metodo que retorna una lista de nodos
     * @return lista de nodos
     */
    public List<GeographicData> getNodes() {
        return nodes;
    }

    /**
     * Metodo para establecer nodos
     * @param nodes puntos geograficos
     */
    public void setNodes(List<GeographicData> nodes) {
        this.nodes = nodes;
    }

    /**
     * Metodo para obtener la distancia
     * @return distancia
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Metodo para establecer distancia
     * @param distance distancia geografica
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Metodo que obtiene el tiempo
     * @return tiempo
     */
    public double getTime() {
        return time;
    }

    /**
     * Metodo para establecer el tiempo
     * @param time tiempo del viaje
     */
    public void setTime(double time) {
        this.time = time;
    }
}
