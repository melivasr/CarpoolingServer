package server.model.empleadoViaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoViajeDao {
    @Autowired
    private EmpleadoViajeRepository repository;

    public EmpleadoViaje save(EmpleadoViaje empleadoViaje) {
        return repository.save(empleadoViaje);
    }

    public List<EmpleadoViaje> getAllViajes() {
        return repository.findAll();
    }

    public EmpleadoViaje getViaje(int correo) {
        return repository.findById(correo).orElse(null);
    }

    public void delete(int empleadoId) {
        repository.deleteById(empleadoId);
    }
}

