package server.model.ruta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para acceder informacion relacionada a rutas de una base de datos
 */
@Repository
public interface RutaRepository extends JpaRepository<RutaData, Integer> {

}
