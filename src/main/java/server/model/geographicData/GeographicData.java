package server.model.geographicData;

import jakarta.persistence.*;
import server.model.distanceData.GeographicDistanceData;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa datos geograficos
 */
@Entity
public class GeographicData {

    @Id
    private int id;

    private String name;

    private double latitude;


    @OneToMany(mappedBy = "origin", cascade = CascadeType.ALL)
    private List<GeographicDistanceData> to_destination_lines;

    @OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
    private List<GeographicDistanceData> from_origin_lines;

    public List<GeographicDistanceData> getTo_destination_lines() {
        return to_destination_lines;
    }

    public void setTo_destination_lines(List<GeographicDistanceData> to_destination_lines) {
        this.to_destination_lines = to_destination_lines;
    }

    public List<GeographicDistanceData> getFrom_origin_lines() {
        return from_origin_lines;
    }

    public void setFrom_origin_lines(List<GeographicDistanceData> from_origin_lines) {
        this.from_origin_lines = from_origin_lines;
    }

    private double longitude;

    /**
     * Constructor generico
     */
    public GeographicData() {
    }

    /**
     * Metodo para obtener el identificador de los datos geograficos
     * @return identificador asociado
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para establecer el identificador de los datos geograficos
     * @param id identificador de los datos geograficos
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que obtiene el nombre de los datos geograficos
     * @return nombre asociado
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para establecer el nombre de los datos geograficos
     * @param name nombre de los datos geograficos
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que obtiene la latitud de los datos geograficos
     * @return latitud asociada
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Metodo para establecer la latitud de los datos geograficos
     * @param latitude latitud de los datos geograficos
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Metodo que obtiene la longitud de los datos geograficos
     * @return longitud asociada
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Metodo para establecer la longitud de los datos geograficos
     * @param latitude longitud de los datos geograficos
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
