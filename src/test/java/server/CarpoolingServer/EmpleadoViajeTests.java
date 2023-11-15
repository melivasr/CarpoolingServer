package server.CarpoolingServer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import server.model.empleadoViaje.EmpleadoViaje;
import server.model.empleadoViaje.EmpleadoViajeDao;

import java.util.List;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class EmpleadoViajeTests {
    @TestConfiguration
    public static class TestConfig {
        @Bean
        public EmpleadoViajeDao empleadoDao() {
            return new EmpleadoViajeDao();
        }
    }

    @Autowired
    private EmpleadoViajeDao empleadoViajeDao;

    @BeforeAll
    public void clear() {
        List<EmpleadoViaje> empleadoViajes = empleadoViajeDao.getAllViajes();
        for (EmpleadoViaje empleadoViaje : empleadoViajes) {
            empleadoViajeDao.delete(empleadoViaje.getId());
        }
    }

    @Test
    void addEmpleadoTest() {
        addEmpleado("bruce@gmail.com", "21");
        addEmpleado("dent@gmail.com", "45");
        addEmpleado("rachel@gmail.com", "7");
    }

    private void addEmpleado(String correo, String ubicacion) {
        EmpleadoViaje empleadoViaje = new EmpleadoViaje();
        empleadoViaje.setCorreo(correo);
        empleadoViaje.setUbicacion(ubicacion);
        empleadoViajeDao.save(empleadoViaje);
    }
}