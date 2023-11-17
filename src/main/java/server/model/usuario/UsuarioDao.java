package server.model.usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

/**
 * Clase que maneja los datos relacionados al usuario
 */
@Service
public class UsuarioDao {
    @Autowired
    private UsuarioRepository repository;

    /**
     * Metodo que guarda informacion de un usuario
     * @param usuario usuario cuya informacion se guardara
     * @return usuario guardado
     */
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    /**
     * Metodo que obtiene una lista con todos los usuarios
     * @return lista de usuarios
     */
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(usuarios::add);
        return usuarios;
    }

    /**
     * Metodo que obtiene un usuario por su correo y password
     * @param correo correo del usuario
     * @param password contrasena del usuario
     * @return usuario cuyo correo y password coincide
     */
    public Usuario getUsuario(String correo, String password) {
        return repository.findByCorreoAndPassword(correo, password);
    }

    /**
     * Metodo que obtiene un usuario por su correo y password
     * @param id correo del usuario
     * @return usuario cuyo correo y password coincide
     */
    public Usuario getUsuarioById(int id) {
        return repository.findById(id);
    }

    /**
     * Metodo que elimina el identificador de un usuario
     * @param usuarioId identificador de un usuario
     */
    public void delete(int usuarioId) {
        repository.deleteById(usuarioId);
    }

    /**
     * Metodo que obtiene una lista con todos los usuarios ordenada por identificador
     * @return lista de usuarios
     */
    public List<Object[]> getUsuariosRegistrados() {
        return repository.findByOrderById();
    }

}
