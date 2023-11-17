package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.empleadoViaje.EmpleadoViaje;
import server.model.empleadoViaje.EmpleadoViajeDao;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que maneja solicitudes HTTP relacionadas a los viajes de los empleados
 */
@RestController
public class EmpleadoViajeController {

    @Autowired
    private EmpleadoViajeDao empleadoViajeDao;

    /**
     * Guarda informacion relacionada al viaje de un empleado
     * @param empleadoViaje entidad que representa un viaje realizado por un empleado
     * @return empleadoViaje guardado
     */
    @PostMapping("/viaje/save")
    public EmpleadoViaje save(@RequestBody EmpleadoViaje empleadoViaje) {
        return empleadoViajeDao.save(empleadoViaje);
    }

    /**
     * Obtiene una lista con todos los viajes realizados
     * @return lista con todos los viajes realizados
     */
    @GetMapping("/viaje/get-all")
    public List<EmpleadoViaje> getAllViajes() {
        return empleadoViajeDao.getAllViajes();
    }

    /**
     * Obtiene un viaje basandose en el correo del usuario relacionado
     * @param correo representa el correo de un usuario
     * @return viaje del usuario cuyo correo coincide
     */
    @GetMapping("/viaje/get")
    public EmpleadoViaje getViaje(@RequestParam int correo) {
        return empleadoViajeDao.getViaje(correo);
    }

    /**
     * Recupera una lista de cadena con todos los viajes de empleados registrados
     * @return lista con todos los viajes registrados separado con comas
     */
    @GetMapping("/viaje/get-empleados")
    public List<String> getRegistrados() {
        return empleadoViajeDao.getEmpleadoViajes().stream()
                .map(array -> String.join(",", Arrays.stream(array).map(String::valueOf).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}
