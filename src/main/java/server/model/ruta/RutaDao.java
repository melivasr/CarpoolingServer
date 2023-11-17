package server.model.ruta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.model.empleadoViaje.EmpleadoViaje;
import server.model.ruta.RutaRepository;

import java.util.List;

/**
 * Clase que maneja datos relacionados a rutas
 */
@Service
public class RutaDao {
    @Autowired
    private RutaRepository repository;

    /**
     * Metodo que guarda informacion sobre una ruta
     * @param rutaData informacion a ser guardada
     * @return rutaData guardada
     */
    public RutaData save(RutaData rutaData) {
        return repository.save(rutaData);
    }

    /**
     * Metodo que elimina una ruta basandose en su identificador
     * @param rutaId identificador de la ruta
     */
    public void delete(int rutaId) {
        repository.deleteById(rutaId);
    }

}

