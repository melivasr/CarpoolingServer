package server.model.distanceData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que maneja solicitudes HTTP relacionadas a distancia geografica en el mapa
 */
@Service
public class GeographicDistanceDao {

    @Autowired
    private GeographicDistanceRepository repository;

    /**
     * Metodo que guarda informacion sobre distancia geografica
     * @param geographicData informacion sobre distancia geografica a ser guardada
     * @return geographicData guardada
     */
    public GeographicDistanceData save(GeographicDistanceData geographicData) {
        return repository.save(geographicData);
    }

    /**
     * Metodo que obtiene todos los nodos de distancia geografica
     * @return lista con todos los nodos
     */
    public List<GeographicDistanceData> getNodos() {
        return repository.findAll();
    }

    /**
     * Metodo que obtiene las coordenadas iniciales
     * @param coordenadasInicio coordenadas de inicio
     * @return datos de distancia geográfica para las coordenadas de inicio dadas.
     */
    public GeographicDistanceData getCoordenadasInicio(int coordenadasInicio) {
        return repository.findById(coordenadasInicio).orElse(null);
    }

    /**
     * Metodo que elimina distancia geografica especificada
     * @param geographicId identificador de la distancia geografica
     */
    public void delete(int geographicId) {
        repository.deleteById(geographicId);
    }
}

