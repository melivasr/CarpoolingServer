package server.CarpoolingServer;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import server.model.usuario.Usuario;
import server.model.usuario.UsuarioDao;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class SpringServerApplicationTests {

	@Autowired
	private UsuarioDao usuarioDao;

	@BeforeAll
	public void clear() {
		List<Usuario> usuarios = usuarioDao.getAllUsuarios();
		for (Usuario usuario : usuarios) {
			usuarioDao.delete(usuario.getId());
		}
	}

	@Test
	void addUsuarioTest() {
		addUsuario("Bruce Wayne", "bruce@gmail.com", "EmpleadoViaje","2","jbjbj", "5");
		addUsuario("Harvey Dent", "dent@gmail.com", "Conductor","5","hbh", "5");
		addUsuario("Rachel", "rachel@gmail.com", "EmpleadoViaje","23","njnj", "5");
	}

	private void addUsuario(String name, String correo, String tipo, String ubicacion, String password, String calificacion) {
		Usuario usuario = new Usuario();
		usuario.setName(name);
		usuario.setCorreo(correo);
		usuario.setTipo(tipo);
		//usuario.setUbicacion(ubicacion);
		usuario.setPassword(password);
		usuario.setCalificacion(calificacion);
		usuarioDao.save(usuario);
	}



}