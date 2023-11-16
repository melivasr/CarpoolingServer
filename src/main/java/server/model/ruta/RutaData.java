package server.model.ruta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RutaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String ruta;


    public RutaData() {
    }

    public int getId() {
        return id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", ruta='" + ruta + '\'' +
                '}';
    }
}
