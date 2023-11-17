package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.amigoViaje.AmigoViaje;
import server.model.amigoViaje.AmigoViajeDao;
import server.model.empleadoViaje.EmpleadoViaje;
import server.model.empleadoViaje.EmpleadoViajeDao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que maneja los amigos en viaje
 */
@RestController
public class AmigoViajeController {

    @Autowired
    private AmigoViajeDao amigoViajeDao;

    /**
     * Metodo que guarda informacion de amigos en viaje
     * @param amigoViaje informacion a ser guardada
     * @return amigoViaje guardado
     */
    @PostMapping("/viaje/save-viajes")
    public AmigoViaje save(@RequestBody AmigoViaje amigoViaje) {
        return amigoViajeDao.save(amigoViaje);
    }

    /**
     * Metodo que obtiene todos los viajes de amigos
     * @return lista con todos los viajes de amigos
     */
    @GetMapping("/viaje/get-all-viajes")
    public List<AmigoViaje> getAllViajes() {
        return amigoViajeDao.getAllViajes();
    }

    /**
     * Metodo que obtiene un viaje especifico basado en un correo
     * @param correo correo asociado al amigo
     * @return amigo en viaje correspondiente
     */
    @GetMapping("/viaje/get-viaje")
    public AmigoViaje getViaje(@RequestParam int correo) {
        return amigoViajeDao.getViaje(correo);
    }

    /**
     * Metodo que obtiene todos los amigos en viajes registrados
     * @return lista separada por comas con todos los amigos en viaje
     */
    @GetMapping("/viaje/get-amigos")
    public List<String> getRegistrados() {
        return amigoViajeDao.getAmigoViajes().stream()
                .map(array -> String.join(",", Arrays.stream(array).map(String::valueOf).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}
