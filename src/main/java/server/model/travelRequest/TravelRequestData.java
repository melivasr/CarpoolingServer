package server.model.travelRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

/**
 * Clase que maneja rutas
 */

public class TravelRequestData {
    private int idUser;
    private List<Integer> usersToPickUp;

    public TravelRequestData() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUsuario) {
        this.idUser = idUsuario;
    }


    public List<Integer> getUsersToPickUp() {
        return usersToPickUp;
    }

    public void setUsersToPickUp(List<Integer> usersToPickUp) {
        this.usersToPickUp = usersToPickUp;
    }
}
