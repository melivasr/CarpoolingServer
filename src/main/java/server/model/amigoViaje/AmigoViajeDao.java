package server.model.amigoViaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que maneja datos relacionados a amigos en viajes
 */
@Service
public class AmigoViajeDao {
    @Autowired
    private AmigoRepository repository;

    /**
     * Metodo que guarda datos sobre amigos en viajes
     * @param amigoViaje datos a ser guardados
     * @return amigoViaje guardado
     */
    public AmigoViaje save(AmigoViaje amigoViaje) {
        return repository.save(amigoViaje);
    }

    /**
     * Metodo que obtiene todos los amigos en viajes
     * @return lista con todos los amigos en viajes
     */
    public List<AmigoViaje> getAllViajes() {
        return repository.findAll();
    }

    /**
     * Metodo que obtiene un amigo en viaje basado en su corro
     * @param correo correo correspondiente al amigo
     * @return amigo cuyo correo coincide
     */
    public AmigoViaje getViaje(int correo) {
        return repository.findById(correo).orElse(null);
    }

    /**
     * Metodo que elimina el identificador de un amigo
     * @param amigoId identificador de amigo
     */
    public void delete(int amigoId) {
        repository.deleteById(amigoId);
    }

    /**
     * Metodo que obtiene todos los amigos en viajes
     * @return lista que obtiene todos los amigos en viajes ordenada por identificador
     */
    public List<Object[]> getAmigoViajes() {
        return repository.findByOrderByIdDesc();
    }
}

