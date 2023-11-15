package server.CarpoolingServer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import server.model.geographicData.GeographicData;
import server.model.geographicData.GeographicDao;

import java.util.List;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
public class GeographicDataTests {
    @TestConfiguration
    public static class TestConfig {
        @Bean
        public GeographicDao geographicDao() {
            return new GeographicDao();
        }
    }

    @Autowired
    private GeographicDao geographicDao;

    @BeforeAll
    public void clear() {
        List<GeographicData> Data = geographicDao.getNodos();
        for (GeographicData geographicData : Data) {
            geographicDao.delete(geographicData.getId());
        }
    }

    @Test
    void addDataTest() {
        addData("0","9.864918, -83.921971", "1"	, "9.864078, -83.922054", "92", "1");
        addData("0", "9.864918, -83.921971", "6", "9.864925, -83.921121", "106", "1");

    }

    private void addData(String nodoInicio, String coordenadasInicio, String nodoFinal, String coordenadasFinal, String distancia, String tiempo) {
        GeographicData geographicData = new GeographicData();
        geographicData.setNodoInicio(nodoInicio);
        geographicData.setCoordenadasInicio(coordenadasInicio);
        geographicData.setNodoFinal(nodoFinal);
        geographicData.setCoordenadasFinal(coordenadasFinal);
        geographicData.setDistancia(distancia);
        geographicData.setTiempo(tiempo);

        geographicDao.save(geographicData);
    }

}