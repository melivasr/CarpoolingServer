package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.empleadoViaje.EmpleadoViaje;
import server.model.empleadoViaje.EmpleadoViajeDao;
import server.model.ruta.RutaDao;
import server.model.ruta.RutaData;

import java.util.List;

/**
 * Clase que maneja solicitudes HTTP relacionadas a rutas
 */
@RestController
public class RutaController {

    @Autowired
    private RutaDao rutaDao;

    /**
     * Metodo para guardar informacion sobre rutas
     * @param rutaData informacion de la ruta a ser guardada
     * @return rutaData guardada
     */
    @PostMapping("/ruta/save")
    public RutaData save(@RequestBody RutaData rutaData) {
        return rutaDao.save(rutaData);
    }


}
