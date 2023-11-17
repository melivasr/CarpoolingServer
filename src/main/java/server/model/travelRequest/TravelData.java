package server.model.travelRequest;

import server.model.geographicData.GeographicData;
import java.util.*;

public class TravelData {
    List<GeographicData> nodes;
    double distance;
    double time;

    public TravelData() {
        this.nodes = nodes;
    }

    public List<GeographicData> getNodes() {
        return nodes;
    }

    public void setNodes(List<GeographicData> nodes) {
        this.nodes = nodes;
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
