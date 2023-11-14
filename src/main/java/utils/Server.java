package utils;

import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {

        Graph map = new Graph();                                                       //crea mapa
        int mapSize = 40;                                                              //cantidad de destinos

        for(int i = 1; i <= mapSize; i++) { map.addVertex(i); }                        //loop para agregar vertices

        for(int i = 1; i <= (mapSize * 3); i++) {                                      //loop para agregar aristas

            int temp = i % mapSize;                                                    //valor valido dentro de mapSize

            int randDestination = (int) Math.floor((Math.random() * mapSize) + 1);     //escoge destino aleatorio
            int randWeight = (int) Math.floor((Math.random() * 10) + 1);               //escoge tiempo aleatorio

            if(temp == randDestination) { i--; }                                       //check para evitar lazos

            else if(temp != 0) { map.addEdge(temp, randDestination, randWeight); }     //agrega arista

            else { map.addEdge(mapSize, randDestination, randWeight); }                //agrega arista

        }

        map.printGraph();                                                              //imprime mapa, borrar mas tarde

        
        //valores temporales
        int start = 20;                                                                //obtiene vertice inicial
        int end = 21;                                                                  //obtiene vertice final

        Map<String, Map<Integer, Integer>> dijkstraSP = map.DijkstraSP(start, end);
        Map<Integer, Integer> previous = dijkstraSP.get("previous");
        Map<Integer, Integer> distances = dijkstraSP.get("distance");

        List<Integer> shortestPath = map.getShortestPath(start, end, previous);        //vertices de la ruta mas corta
        System.out.println("El camino mas corto es: " + shortestPath);

        int ETA = distances.get(end);                                                  //tiempo de llegada

        if(ETA >= 999999) { System.out.println("No existen rutas"); }                  //caso sin rutas disponibles

        else { System.out.println("ETA: " + ETA + "s"); }
        
    }
}



/*

        Check si hay gente en el camino:

        if(shortestPath.contains(x)) {
            System.out.println("ok");
        }
        
*/
