package server;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modelo")
public class Controller {

    ManejoDatos datosUsuario;

    @GetMapping("{usuario}")
    public ManejoDatos obtenerDatos(String usuario){

        return datosUsuario;
        }

    @PostMapping
    public String crearUsuario(@RequestBody  ManejoDatos datosUsuario){
    this.datosUsuario = datosUsuario;
    return "Se ha obtenido el cliente";
    }

    @PutMapping
    public String actualizarUsuario(@RequestBody  ManejoDatos datosUsuario){
        this.datosUsuario = datosUsuario;
        return "Se ha actualizado correctamente";
    }

    @DeleteMapping("{usuario}")
    public String eliminarUsuario(String datosUsuario){
        this.datosUsuario = null;
        return "Se ha eliminado correctamente";
    }
}
