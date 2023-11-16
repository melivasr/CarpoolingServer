package server.controller;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.model.usuario.Usuario;
import server.model.usuario.UsuarioDao;

@RestController
public class Controller {

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping("/usuario/get-all")
    public List<Usuario> getAllUsuarios() {
        return usuarioDao.getAllUsuarios();
    }

    @PostMapping("/usuario/save")
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @GetMapping("/usuario/login")
    public Usuario getUsuario(@RequestParam String correo, @RequestParam String password) {
        return usuarioDao.getUsuario(correo, password);
    }

    @GetMapping("/usuario/get-registrados")
    public List<String> getRegistrados() {
        return usuarioDao.getUsuariosRegistrados().stream()
                .map(array -> String.join(",", Arrays.stream(array).map(String::valueOf).collect(Collectors.toList())))
                .collect(Collectors.toList());
    }

}