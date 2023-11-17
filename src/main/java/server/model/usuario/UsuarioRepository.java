package server.model.usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import server.model.usuario.Usuario;

import java.util.List;

/**
 * Repositorio para acceder informacion relacionada a usuarios de una base de datos
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    /**
     * Metodo que obtiene un usuario por su correo y contrasena
     * @param correo correo asociado al usuario
     * @param password contrasena asociada al usuario
     * @return usuario cuyo correo y contrasena coincide
     */
    @Query("SELECT u FROM Usuario u WHERE u.correo = ?1 AND u.password = ?2")
    Usuario findByCorreoAndPassword(String correo, String password);

    /**
     * Metodo que obtiene un usuario por su correo y contrasena
     * @param correo correo asociado al usuario
     * @param password contrasena asociada al usuario
     * @return usuario cuyo correo y contrasena coincide
     */
    @Query("SELECT u FROM Usuario u WHERE u.id = ?1")
    Usuario findById(int id);


    @Query("SELECT u FROM Usuario u WHERE u.correo = ?1")
    Usuario findByCorreo(String correo);
    /**
     * Metodo que obtiene una lista de usuarios ordenada por identificador
     * @return lista de usuarios
     */
    @Query("SELECT e.name, e.correo, e.calificacion FROM Usuario e ORDER BY e.id DESC")
    List<Object[]> findByOrderById();

}