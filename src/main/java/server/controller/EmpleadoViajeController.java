package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.empleadoViaje.EmpleadoViaje;
import server.model.empleadoViaje.EmpleadoViajeDao;


import java.util.List;
@RestController
public class EmpleadoViajeController {

    @Autowired
    private EmpleadoViajeDao empleadoViajeDao;

    @PostMapping("/viaje/save")
    public EmpleadoViaje save(@RequestBody EmpleadoViaje empleadoViaje) {
        return empleadoViajeDao.save(empleadoViaje);
    }

    @GetMapping("/viaje/get-all")
    public List<EmpleadoViaje> getAllViajes() {
        return empleadoViajeDao.getAllViajes();
    }

    @GetMapping("/viaje/get")
    public EmpleadoViaje getViaje(@RequestParam int correo) {
        return empleadoViajeDao.getViaje(correo);
    }
}
