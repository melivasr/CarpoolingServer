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
		addUsuario("Bruce Wayne", "bruce@gmail.com", "Empleado");
		addUsuario("Harvey Dent", "dent@gmail.com", "Conductor");
		addUsuario("Rachel", "rachel@gmail.com", "Empleado");
	}

	private void addUsuario(String name, String correo, String tipo) {
		Usuario usuario = new Usuario();
		usuario.setName(name);
		usuario.setCorreo(correo);
		usuario.setTipo(tipo);
		usuarioDao.save(usuario);
	}

}