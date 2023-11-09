package server;

public class ManejoDatos{

    private String usuario;
    private String distancia;
    private String tipo;

    public ManejoDatos() {
    }
    public ManejoDatos(String usuario, String distancia, String tipo) {
        this.usuario = usuario;
        this.distancia = distancia;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
