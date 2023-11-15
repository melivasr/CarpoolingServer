package server.model.empleadoViaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoViajeRepository extends JpaRepository<EmpleadoViaje, Integer> {
}
