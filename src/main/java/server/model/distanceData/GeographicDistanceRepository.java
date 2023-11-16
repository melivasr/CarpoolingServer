package server.model.distanceData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeographicDistanceRepository extends JpaRepository<GeographicDistanceData, Integer> {
}

