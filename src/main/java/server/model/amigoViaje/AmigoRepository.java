package server.model.amigoViaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import server.model.empleadoViaje.EmpleadoViaje;

import java.util.List;

@Repository
public interface AmigoRepository extends JpaRepository<server.model.amigoViaje.AmigoViaje, Integer> {
    @Query("SELECT e.ubicacion FROM AmigoViaje e ORDER BY e.id DESC")
    List<Object[]> findByOrderByIdDesc();
}

