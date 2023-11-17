package utils;

import java.util.*;

/**
 * Clase que maneja el grafo representante del mapa
 */
public class Graph {

    private Map<Integer, List<Edge>> graph;

    /**
     * Constructor del grafo
     */
    public Graph() { graph = new HashMap<>(); }

    /**
     * Metodo para agregarle vertices al grafo
     * @param vertex vertice
     */
    public void addVertex(int vertex) { graph.put(vertex, new ArrayList<>()); }

    /**
     * Metodo para agregar aristas
     * @param source origen de la arista
     * @param destination destino de la arista
     * @param weight peso de la arista
     */
    public void addEdge(int source, int destination, int weight) {

        if(!graph.containsKey(source) || !graph.containsKey(destination)) { throw new IllegalArgumentException(); }

        else {

            List<Edge> edgeList = graph.get(source);
            edgeList.add(new Edge(destination, weight));

        }
    }

    /**
     * Metodo para encontrar la ruta mas corta con el algoritmo de Dijkstra
     * @param start vertice inicial
     * @param end vertice final
     * @return HashMap con informacion sobre vertices anteriores y tiempos minimos desde el vertice inicial
     * @throws IllegalArgumentException el vertice no existe en el grafo
     */
    public Map<String, Map<Integer, Integer>> DijkstraSP(int start, int end) {

        if(!graph.containsKey(start) || !graph.containsKey(end)) { throw new IllegalArgumentException(); }

        Map<Integer, Integer> distance = new HashMap<>();
        Map<Integer, Integer> previous = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distance::get));

        for(int vertex : graph.keySet()) {

            if(vertex == start) { distance.put(vertex, 0); }

            else { distance.put(vertex, 999999); }

            priorityQueue.offer(vertex);

        }

        while(!priorityQueue.isEmpty()) {

            int currentVertex = priorityQueue.poll();

            if(currentVertex == end) { break; }

            if(!visited.contains(currentVertex)) {

                visited.add(currentVertex);

                for(Edge edge : graph.get(currentVertex)) {

                    int neighbor = edge.getDestination();
                    int weightSum = distance.get(currentVertex) + edge.getWeight();

                    if(weightSum < distance.get(neighbor)) {

                        distance.put(neighbor, weightSum);
                        previous.put(neighbor, currentVertex);
                        priorityQueue.remove(neighbor);
                        priorityQueue.offer(neighbor);

                    }
                }
            }
        }

        Map<String, Map<Integer, Integer>> result = new HashMap<>();
        result.put("previous", previous);
        result.put("distance", distance);
        return result;

    }

    /**
     * Metodo que obtiene una lista con los vertices del camino mas corto
     * @param start vertice inicial
     * @param end vertice final
     * @param previous mapa de vertices anteriores
     * @return vertices atravesados en el camino
     */
    public List<Integer> getShortestPath(int start, int end, Map<Integer, Integer> previous) {

        List<Integer> path = new ArrayList<>();
        int currentVertex = end;

        while(previous.containsKey(currentVertex) && currentVertex != start) {

            path.add(currentVertex);
            currentVertex = previous.get(currentVertex);

        }

        if(currentVertex == start) {

            path.add(currentVertex);
            Collections.reverse(path);

        }

        else {

            System.out.println("No existen rutas");
            path.clear();

        }

        return path;

    }

    //metodo temporal
    public void printGraph() {

        for (int vertex : graph.keySet()) {

            System.out.print(vertex + " -> ");
            List<Edge> edges = graph.get(vertex);

            for(Edge edge : edges) { System.out.print("(" + edge.getDestination() + ", " + edge.getWeight() + ") "); }

            System.out.println();

        }
    }
    //metodo temporal

}
