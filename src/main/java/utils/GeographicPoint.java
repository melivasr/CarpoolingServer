package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un punto geografico
 */
public class GeographicPoint {
    int id;
    double latitude;
    double longitude;
    String name;

    List<GeographicLine> nearestPointsLines;

    /**
     * Constructor del punto
     * @param id identifiacador de la ubicacion
     * @param latitude latitud de la ubicacion
     * @param longitude longitud de la ubicacion
     * @param name nombre de la ubicacion
     */
    public GeographicPoint(int id, double latitude, double longitude, String name) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.nearestPointsLines = new ArrayList<GeographicLine>();
    }

    /**
     * Metodo que obtiene las lineas geograficas cercanas al punto
     * @return lista de lineas geograficas cercanas
     */
    public List<GeographicLine> getNearestPoints() {
        return nearestPointsLines;
    }

    /**
     * Metodo para establecer las lineas geograficas cercanas al punto
     * @param nearestPoints puntos geograficos cercanos
     */
    public void setNearestPoints(List<GeographicLine> nearestPoints) {
        this.nearestPointsLines = nearestPoints;
    }

    /**
     * Metodo que obtiene el identificador del punto
     * @return identificador
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para establecer el identificador del punto
     * @param id identificador del punto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que obtiene la latitud del punto
     * @return latitud
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Metodo para establecer la latitud del punto
     * @param latitude latitud del punto
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Metodo que obtiene la longitud del punto
     * @return longitud
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Metodo para establecer la longitud del punto
     * @param longitude longitud del punto
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Metodo que obtiene el nombre del punto
     * @return nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para establecer el nombre del punto
     * @param name nombre del punto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que convierte la informacion de un punto a un String
     * @return String con la infromacion de un punto
     */
    @Override
    public String toString() {
        return id +", \""+name +"\", "+latitude +", "+longitude;
    }
}