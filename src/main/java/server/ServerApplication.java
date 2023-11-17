package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Clase que inicia la aplicacion
 */
@SpringBootApplication
@EntityScan({"server.model.usuario", "server.model.empleadoViaje", "server.model.geographicData", "server.model.distanceData", "server.model.ruta", "server.model.amigoViaje"})
public class ServerApplication {

	/**
	 * Metodo principal para iniciar la clase
	 * @param args argumentos de linea de comando
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}