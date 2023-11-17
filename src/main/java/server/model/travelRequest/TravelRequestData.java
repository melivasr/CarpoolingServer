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

    private String correoUser;
    private List<Integer> usersToPickUp;

    /**
     * Constructor generico
     */
    public TravelRequestData() {
    }

    /**
     * Metodo que obtiene el identificador del usuario
     * @return
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Metodo que obtiene el correo del usuario
     * @return
     */
    public String getCorreoUser(){
        return correoUser;
    }

    /**
     * Metodo para establecer el identificador del usuario
     * @param idUsuario
     */
    public void setIdUser(int idUsuario) {
        this.idUser = idUsuario;
    }

    /**
     * Metodo que obtiene los usuarios a ser recogidos
     * @return lista de usuarios a recoger
     */
    public List<Integer> getUsersToPickUp() {
        return usersToPickUp;
    }

    /**
     * Metodo para establecer los usuarios a ser recogidos
     * @param usersToPickUp lista de usuarios a ser recogidos
     */
    public void setUsersToPickUp(List<Integer> usersToPickUp) {
        this.usersToPickUp = usersToPickUp;
    }
}
