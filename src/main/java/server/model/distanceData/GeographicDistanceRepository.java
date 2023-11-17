package server.model.distanceData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para acceder informacion sobre distancia geografica de una base de datos
 */
@Repository
public interface GeographicDistanceRepository extends JpaRepository<GeographicDistanceData, Integer> {
}

