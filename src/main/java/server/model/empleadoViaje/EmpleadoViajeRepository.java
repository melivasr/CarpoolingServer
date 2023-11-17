package server.model.empleadoViaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para acceder informacion sobre empleados en viajes de una base de datos
 */
@Repository
public interface EmpleadoViajeRepository extends JpaRepository<EmpleadoViaje, Integer> {
    @Query("SELECT e.ubicacion FROM EmpleadoViaje e ORDER BY e.id DESC")
    List<Object[]> findByOrderByIdDesc();
}