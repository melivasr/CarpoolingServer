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

    }
}



/*

        codigo para la ruta mas corta:

        int start = x;                                                                 //obtiene vertice inicial
        int end = y;                                                                   //obtiene vertice final
        Map<Integer, Integer> shortestPath = map.DijkstraSP(start, end);               //
        int result = shortestPath.get(end);                                            //menor distancia posible

*/