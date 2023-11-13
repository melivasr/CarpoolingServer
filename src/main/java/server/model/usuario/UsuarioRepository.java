package server.model.usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.model.usuario.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}