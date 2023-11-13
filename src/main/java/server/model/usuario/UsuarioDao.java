package server.model.usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;


@Service
public class UsuarioDao {
    @Autowired
    private UsuarioRepository repository;

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(usuarios::add);
        return usuarios;
    }

    public void delete(int usuarioId) {
        repository.deleteById(usuarioId);
    }
}
