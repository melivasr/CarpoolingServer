package server.model.distanceData;

import server.model.geographicData.GeographicData;
import jakarta.persistence.*;

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

    public GeographicDistanceData() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GeographicData getOrigin() {
        return origin;
    }

    public void setOrigin(GeographicData origin) {
        this.origin = origin;
    }

    public GeographicData getDestination() {
        return destination;
    }

    public void setDestination(GeographicData destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
