package utils;

import java.util.ArrayList;
import java.util.List;

public class GeographicPoint {
    int id;
    double latitude;
    double longitude;
    String name;

    List<GeographicLine> nearestPointsLines;

    public GeographicPoint(int id, double latitude, double longitude, String name) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.nearestPointsLines = new ArrayList<GeographicLine>();
    }

    public List<GeographicLine> getNearestPoints() {
        return nearestPointsLines;
    }

    public void setNearestPoints(List<GeographicLine> nearestPoints) {
        this.nearestPointsLines = nearestPoints;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +", \""+name +"\", "+latitude +", "+longitude;
    }
}


