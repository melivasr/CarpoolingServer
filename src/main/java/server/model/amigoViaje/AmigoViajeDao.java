package server.model.amigoViaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigoViajeDao {
    @Autowired
    private AmigoRepository repository;

    public AmigoViaje save(AmigoViaje amigoViaje) {
        return repository.save(amigoViaje);
    }

    public List<AmigoViaje> getAllViajes() {
        return repository.findAll();
    }

    public AmigoViaje getViaje(int correo) {
        return repository.findById(correo).orElse(null);
    }

    public void delete(int amigoId) {
        repository.deleteById(amigoId);
    }

    public List<Object[]> getAmigoViajes() {
        return repository.findByOrderByIdDesc();
    }
}

