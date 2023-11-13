package server.model.usuario;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import server.model.usuario.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}