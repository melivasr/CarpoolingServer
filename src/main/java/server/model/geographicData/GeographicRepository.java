package server.model.geographicData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.model.geographicData.GeographicData;

/**
 * Repositorio para acceder informacion geografica de una base de datos
 */
@Repository
public interface GeographicRepository extends JpaRepository<GeographicData, Integer> {
}