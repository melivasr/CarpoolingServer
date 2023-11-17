package utils;

/**
 * Clase que maneja las aristas del grafo
 */
public class Edge {

    private int destination;
    private int weight;

    /**
     * Constructor de aristas
     * @param destination vertice destino de la arista
     * @param weight peso de la arista
     */
    public Edge(int destination, int weight) {

        this.destination = destination;
        this.weight = weight;

    }

    /**
     * Metodo que obtiene el destino de la arista
     * @return destino asociado
     */
    public int getDestination() { return destination; }

    /**
     * Metodo que obtiene el peso de la arista
     * @return peso asociado
     */
    public int getWeight() { return weight; }

}