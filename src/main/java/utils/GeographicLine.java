package utils;

/**
 * Clase que representa lineas geograficas
 */
public class GeographicLine {
    double distance;
    double time;
    int destinationId;
    int originId;

    /**
     * Constructor de las lineas
     * @param distance distancia entre ubicaciones
     * @param time tiempo entre ubicaciones
     * @param destinationId identifacador de la ubicacion destino
     * @param originId identificador de la ubicacion origen
     */
    public GeographicLine(double distance, double time, int destinationId, int originId) {
        this.distance = distance;
        this.time = time;
        this.destinationId = destinationId;
        this.originId = originId;
    }

    /**
     * Metodo que obtiene la distancia
     * @return distancia
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Metodo para establecer la distancia
     * @param distance distancia entre ubicaciones
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
     * @param time tiempo entre ubicaciones
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * Metodo que obtiene el identificador del destino
     * @return identificador del destino
     */
    public int getDestinationId() {
        return destinationId;
    }

    /**
     * Metodo para establecer el identificador del destino
     * @param destinationId identificador de la ubicacion destino
     */
    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    /**
     * Metodo que obtiene el identificador del origen
     * @return identificador del origen
     */
    public int getOriginId() {
        return originId;
    }

    /**
     * Metodo para establecer el identificador del origen
     * @param originId identificador de la ubicacion origen
     */
    public void setOriginId(int originId) {
        this.originId = originId;
    }

    /**
     * Metodo que convierte la informacion de la linea en un String
     * @return String con la informacion de la linea
     */
    @Override
    public String toString() {
        return originId +", "+destinationId +", "+distance +", "+time;
    }
}
