package utils;

public class GeographicLine {
    double distance;
    double time;
    int destinationId;
    int originId;

    public GeographicLine(double distance, double time, int destinationId, int originId) {
        this.distance = distance;
        this.time = time;
        this.destinationId = destinationId;
        this.originId = originId;
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

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

    @Override
    public String toString() {
        return originId +", "+destinationId +", "+distance +", "+time;
    }
}
