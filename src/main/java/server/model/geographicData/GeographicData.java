package server.model.geographicData;

import jakarta.persistence.*;
import server.model.distanceData.GeographicDistanceData;

import java.util.ArrayList;
import java.util.List;

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

    public GeographicData() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
