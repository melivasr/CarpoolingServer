package server.model.empleadoViaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que maneja datos relacionados a los empleados en un viaje
 */
@Service
public class EmpleadoViajeDao {
    @Autowired
    private EmpleadoViajeRepository repository;

    /**
     * Metodo que guarda informacion sobre un empleado en viaje
     * @param empleadoViaje objeto a guardar
     * @return empleadoViaje guardado
     */
    public EmpleadoViaje save(EmpleadoViaje empleadoViaje) {
        return repository.save(empleadoViaje);
    }

    /**
     * Metodo que retorna una lista de todos los viajes
     * @return lista de todos los viajes
     */
    public List<EmpleadoViaje> getAllViajes() {
        return repository.findAll();
    }

    /**
     * Metodo que obtiene un viaje basandose en el correo del empleado
     * @param correo correo asociado al empleado en el viaje
     * @return viaje del empleado cuyo correo coincide
     */
    public EmpleadoViaje getViaje(int correo) {
        return repository.findById(correo).orElse(null);
    }

    /**
     * Metodo para eliminar un empleado en un viaje basado en un identificador
     * @param empleadoId identificador para el empleado
     */
    public void delete(int empleadoId) {
        repository.deleteById(empleadoId);
    }

    /**
     * Metodo que obtiene una lista de arreglos de empleados en viajes ordenada por identificador descendiente
     * @return lista de arreglos de empleados en viajes ordenada por identificador descendiente
     */
    public List<Object[]> getEmpleadoViajes() {
        return repository.findByOrderByIdDesc();
    }
}

