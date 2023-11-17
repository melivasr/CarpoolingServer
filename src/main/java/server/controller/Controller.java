package server.controller;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.usuario.Usuario;
import server.model.usuario.UsuarioDao;

/**
 * Clase que maneja solicitudes HTTP relacionadas a los usuarios
 */
@RestController
public class Controller {

    @Autowired
    private UsuarioDao usuarioDao;

    /**
     * Metodo que obtiene una lista con los usuarios
     * @return lista de usuarios
     */
    @GetMapping("/usuario/get-all")
    public List<Usuario> getAllUsuarios() {
        return usuarioDao.getAllUsuarios();
    }

    /**
     * Guarda informacion sobre un usuario
     * @param usuario entidad que representa el usuario
     * @return el usuario guardado
     */
    @PostMapping("/usuario/save")
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    /**
     * Metodo que obtiene un usuario basado en su correo y password
     * @param correo representa el correo del usuario
     * @param password representa la contrasena del usuario
     * @return usuario con correro y password coincidentes
     */
    @GetMapping("/usuario/login")
    public Usuario getUsuario(@RequestParam String correo, @RequestParam String password) {
        return usuarioDao.getUsuario(correo, password);
    }

    /**
     * Metodo que obtiene una lista de cadenas de usuarios registrados
     * @return lista con todos los usuarios registrados separado con comas
     */
    @GetMapping("/usuario/get-registrados")
    public List<String> getRegistrados() {
        return usuarioDao.getUsuariosRegistrados().stream()
                .map(array -> String.join(",", Arrays.stream(array).map(String::valueOf).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }

}