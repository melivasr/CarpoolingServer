package server.CarpoolingServer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import server.controller.GeographicDataController;
import server.model.geographicData.GeographicData;
import server.model.usuario.Usuario;
import server.model.geographicData.GeographicDao;
import server.model.usuario.UsuarioDao;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = GeographicDataController.class)
class GeographicDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GeographicDao geographicDao;

    @MockBean
    private UsuarioDao usuarioDao;

    @BeforeEach
    void setup() {
        GeographicData geographicData = new GeographicData();
        // Configura los datos en geographicData
        Mockito.when(geographicDao.getUbicadionDataById(anyInt())).thenReturn(geographicData);

        Usuario usuario = new Usuario();
        // Configura los datos en usuario
        Mockito.when(usuarioDao.getUsuarioById(anyInt())).thenReturn(usuario);
    }

    @Test
    void testGetRegistrados() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/viaje/get-best-path")
                        .param("myObject", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("[{\"id\":1,\"ubication\":\"Location1\"},{\"id\":1,\"ubication\":\"Location1\"}]"));
    }
}
