package server.model.usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import server.model.usuario.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("SELECT u FROM Usuario u WHERE u.correo = ?1 AND u.password = ?2")
    Usuario findByCorreoAndPassword(String correo, String password);

    @Query("SELECT e.name, e.correo FROM Usuario e ORDER BY e.id DESC")
    List<Object[]> findByOrderById();

}

