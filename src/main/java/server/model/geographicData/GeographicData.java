package server.model.geographicData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GeographicData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nodoInicio;

    private String coordenadasInicio;

    private String nodoFinal;
    private String coordenadasFinal;
    private String distancia;

    private String tiempo;

    public GeographicData() {
    }

    public String getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(String nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(String nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    public String getCoordenadasInicio() {
        return coordenadasInicio;
    }

    public void setCoordenadasInicio(String coordenadasInicio) {
        this.coordenadasInicio = coordenadasInicio;
    }

    public String getCoordenadasFinal() {
        return coordenadasFinal;
    }

    public void setCoordenadasFinal(String coordenadasFinal) {
        this.coordenadasFinal = coordenadasFinal;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + nodoInicio + '\'' +
                ", correo='" + coordenadasInicio + '\'' +
                ", tipo='" + nodoFinal + '\'' +
                ", password='" + coordenadasFinal + '\'' +
                ", ubicacion='" + distancia + '\''+
                ", calificacion='" + tiempo + '\''+
                '}';
    }

}
