package server;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modelo")
public class Controller {

    Modelo modelo;

    @GetMapping("{usuario}")
    public Modelo obtenerDatos(String usuario){

        return modelo;
        }

    @PostMapping
    public String obtenerClientes(@RequestBody Modelo modelo){
    this.modelo = modelo;
    return "Se ha obtenido el cliente";
    }

    @PutMapping
    public String actualizarClientes(@RequestBody Modelo modelo){
        this.modelo = modelo;
        return "Se ha actualizado correctamente";
    }

    @DeleteMapping("{usuario}")
    public String eliminarClientes(String usuario){
        this.modelo = null;
        return "Se ha eliminado correctamente";
    }
}
