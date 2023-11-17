package server.model.geographicData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que maneja datos relacionados a informacion geografica
 */
@Service
public class GeographicDao {
    @Autowired
    private GeographicRepository repository;

    /**
     * Metodo que guarda informacion geografica
     * @param geographicData informacion geografica a ser guardada
     * @return geographicData guardada
     */
    public GeographicData save(GeographicData geographicData) {
        return repository.save(geographicData);
    }

    /**
     * Metodo que obtiene una lista con todos los nodos de datos geograficos
     * @return lista de nodos
     */
    public List<GeographicData> getNodos() {
        return repository.findAll();
    }

    /**
     * Metodo que obtiene las coordenadas iniciales de los datos geograficos
     * @param coordenadasInicio coordenadas inciales
     * @return datos geograficos de las coordenadas inciales
     */
    public GeographicData getCoordenadasInicio(int coordenadasInicio) {
        return repository.findById(coordenadasInicio).orElse(null);
    }

    /**
     * Metodo que elimina datos geograficos basandose en un identificador
     * @param geographicId identificador de datos geograficos
     */
    public void delete(int geographicId) {
        repository.deleteById(geographicId);
    }
}