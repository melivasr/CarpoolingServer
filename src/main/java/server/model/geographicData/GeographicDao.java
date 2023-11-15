package server.model.geographicData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicDao {
    @Autowired
    private GeographicRepository repository;

    public GeographicData save(GeographicData geographicData) {
        return repository.save(geographicData);
    }

    public List<GeographicData> getNodos() {
        return repository.findAll();
    }

    public GeographicData getCoordenadasInicio(int coordenadasInicio) {
        return repository.findById(coordenadasInicio).orElse(null);
    }

    public void delete(int geographicId) {
        repository.deleteById(geographicId);
    }
}

