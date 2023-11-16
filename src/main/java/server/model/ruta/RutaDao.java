package server.model.ruta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import server.model.empleadoViaje.EmpleadoViaje;
import server.model.ruta.RutaRepository;

import java.util.List;

@Service
public class RutaDao {
    @Autowired
    private RutaRepository repository;

    public RutaData save(RutaData rutaData) {
        return repository.save(rutaData);
    }


    public void delete(int rutaId) {
        repository.deleteById(rutaId);
    }

}

