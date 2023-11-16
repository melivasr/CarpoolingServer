package server.model.distanceData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeographicDistanceDao {
    @Autowired
    private GeographicDistanceRepository repository;

    public GeographicDistanceData save(GeographicDistanceData geographicData) {
        return repository.save(geographicData);
    }

    public List<GeographicDistanceData> getNodos() {
        return repository.findAll();
    }

    public GeographicDistanceData getCoordenadasInicio(int coordenadasInicio) {
        return repository.findById(coordenadasInicio).orElse(null);
    }

    public void delete(int geographicId) {
        repository.deleteById(geographicId);
    }
}

