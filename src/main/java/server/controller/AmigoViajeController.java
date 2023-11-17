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

@RestController
public class AmigoViajeController {

    @Autowired
    private AmigoViajeDao amigoViajeDao;

    @PostMapping("/viaje/save")
    public AmigoViaje save(@RequestBody AmigoViaje amigoViaje) {
        return amigoViajeDao.save(amigoViaje);
    }

    @GetMapping("/viaje/get-all")
    public List<AmigoViaje> getAllViajes() {
        return amigoViajeDao.getAllViajes();
    }

    @GetMapping("/viaje/get")
    public AmigoViaje getViaje(@RequestParam int correo) {
        return amigoViajeDao.getViaje(correo);
    }

    @GetMapping("/viaje/get-empleados")
    public List<String> getRegistrados() {
        return amigoViajeDao.getAmigoViajes().stream()
                .map(array -> String.join(",", Arrays.stream(array).map(String::valueOf).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}
